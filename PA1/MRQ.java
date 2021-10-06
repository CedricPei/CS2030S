public class MRQ extends Question implements MarkInterface {
    private final String ques;
    private final String[] opts;
    private final int[] ans;
    private final int[] correctAnswer;

    public MRQ(String ques, String[] opts, int[] correctAnswer) {
        this.ques = ques;
        this.opts = opts;
        this.ans = new int[9999];
        this.correctAnswer = correctAnswer;
    }

    private MRQ(String[] opts, int[] ans, int[] correctAnswer, String ques) {
        this.ques = ques;
        this.opts = opts;
        this.ans = ans;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public MRQ answer(int choice) {
        int[] copyValue = new int[ans.length];
        for (int i = 0; i < ans.length; i++) {
            copyValue[i] = ans[i];
        }
        //如果选过，就取消选择
        boolean cancel = false;
        for (int i = 0; i < copyValue.length; i++) {
            if (copyValue[i] == choice) {
                copyValue[i] = 0;
                cancel = true;
            }
        }

        if (!cancel) {
            for (int i = 0; i < copyValue.length; i++) {
                if (copyValue[i] == 0) {
                    copyValue[i] = choice;
                    break;
                }
            }
        }
        sort(copyValue);
        return new MRQ(opts, copyValue, correctAnswer, ques);
    }

    /**
     * 一个简单的排序，时间复杂度O(n^2)，需要更低的自己提供其他排序，快排之类的，从小到大
     * @param ans
     * @return
     */
    private int[] sort(int[] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = ans.length - 1; j > i; j--) {
                if (ans[i] > ans[j]) {
                    int temp = ans[i];
                    ans[i] = ans[j];
                    ans[j] = temp;
                }
            }
        }
        return ans;
    }

    /**
     * 一个简单的排序，时间复杂度O(n^2)，需要更低的自己提供其他排序，快排之类的, 从大到小
     * @param ans
     * @return
     */
    private int[] deSort(int[] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = ans.length - 1; j > i; j--) {
                if (ans[i] < ans[j]) {
                    int temp = ans[i];
                    ans[i] = ans[j];
                    ans[j] = temp;
                }
            }
        }
        return ans;
    }

    @Override
    public int mark() {
        deSort(correctAnswer);
        deSort(ans);
        for (int i = 0; i < correctAnswer.length; i++) {
            if (i >= ans.length) {
                return 0;
            }
            if (ans[i] != correctAnswer[i]) {
                return 0;
            }
        }
        return 1;
    }

    @Override
    public String toString() {
        String opsString = "";
        int index = 1;
        for (String opt : opts) {
            opsString += "[" + index + ":" + opt +"]";
            index++;
        }
        opsString += ";";

        sort(ans);
        String answerString = " Your answer: ";
        String s = "[ ";
        for (int a : ans) {
            if (a != 0) {
                s += a + " ";
            }
        }
        s += "]";
        answerString += s;
        return ques + " " + opsString + answerString;
    }
}

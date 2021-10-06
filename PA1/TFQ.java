public class TFQ extends MCQ {
    private final String ques;
    private final String[] ans = new String[] {"True", "False"};
    private final int answer;
    private final String correctAnswer;

    public TFQ(String ques, String correctAnswer) {
        this.ques = ques;
        this.answer = 0;
        this.correctAnswer = correctAnswer;
    }

    public TFQ(String ques, int answer, String correctAnswer) {
        this.ques = ques;
        this.answer = answer;
        this.correctAnswer = correctAnswer;
    }

    public TFQ answer(String newAns) {
        int answer = 0;
        for (int i = 0; i < ans.length; i++) {
            if (ans[i].equalsIgnoreCase(newAns)) {
                answer = i;
                break;
            }
        }
        TFQ ansTFQ = new TFQ(this.ques, answer + 1, this.correctAnswer);
        return ansTFQ;
    }

    @Override
    public TFQ answer(int newAns) {
        TFQ ansTFQ = new TFQ(this.ques, newAns, this.correctAnswer);
        return ansTFQ;
    }

    public int mark() {
        if (answer <= 0) {
            return 0;
        }
        if (correctAnswer.equalsIgnoreCase(ans[answer - 1])) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        String question = ques;
        String optionString = "";
        int index = 1;
        for (String s : ans) {
            optionString += "[" + index + ":" + s + "]";
            index++;
        }
        optionString += ";";

        String ansString = "[ ? ]";
        if (this.answer != 0) {
            ansString = "[ " + answer + ":" + ans[answer - 1] + " ]";
        }
        return question + " " + optionString + " Your answer: " + ansString;
    }
}


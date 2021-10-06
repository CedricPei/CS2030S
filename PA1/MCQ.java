public class MCQ extends Question implements MarkInterface{
    private final String ques;
    private final String[] ans;
    private final int answer;
    private final int correctAnswer;

    protected MCQ() {
        this.ques = "";
        this.ans = new String[0];
        this.answer = 0;
        this.correctAnswer = 0;
    }

    public MCQ(String ques, String[] ans, int answer) {
        this.ques = ques;
        this.ans = ans;
        this.answer = 0;
        this.correctAnswer = answer;
    }

    private MCQ(int answer, String ques, String[] ans, int correctAnswer) {
        this.answer = answer;
        this.ques = ques;
        this.ans = ans;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public MCQ answer(int newAnswer) {
        MCQ ansMCQ = new MCQ(newAnswer, this.ques, this.ans, this.correctAnswer);
        return ansMCQ;
    }

    @Override
    public int mark() {
        if (answer == correctAnswer) {
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

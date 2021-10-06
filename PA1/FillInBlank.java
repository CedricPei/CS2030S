public class FillInBlank extends Question implements MarkInterface{
    private final int ans;
    private final String ques;
    private final int correctAnswer;
    private final Grader grader;

    public FillInBlank(String question, Grader grader) {
        this.ques = question;
        this.ans = 0;
        this.grader = grader;
        this.correctAnswer = 0;
    }

    public FillInBlank(String question, int answer) {
        this.ques = question;
        this.ans = 0;
        this.correctAnswer = answer;
        //level 4默认评分器
        this.grader = new Grader() {
            @Override
            public int grade(int answer) {
                if (answer == correctAnswer) {
                    return 1;
                }
                return 0;
            }
        };
    }

    private FillInBlank(int answer, String question, Grader grader, int correctAnswer) {
        this.ques = question;
        this.ans = answer;
        this.grader = grader;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public FillInBlank answer(int newAnswer) {
        FillInBlank ansFIB = new FillInBlank(newAnswer, this.ques, this.grader, this.correctAnswer);
        return ansFIB;
    }

    @Override
    public int mark() {
        //有评分器就用评分器
        return grader.grade(this.ans);
    }

    @Override
    public String toString() {
        return this.ques + ";" + " Your answer: " + this.ans;
    }
}

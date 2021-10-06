public class OffByOneGrader extends Grader {

    private final int expectedAns;

    public OffByOneGrader(int expectedAns) {
        this.expectedAns = expectedAns;
    }

    @Override
    public int grade(int answer) {
        int diff = expectedAns >= answer ? expectedAns - answer : answer - expectedAns;
        if (diff == 0) {
            return 2;
        }
        if (diff == 1) {
            return 1;
        }
        return 0;
    }
}


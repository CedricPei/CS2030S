public class Assessment implements Keyable {
    private final String assess;
    private final String grade;

    Assessment(String assess, String grade) {
        this.assess = assess;
        this.grade = grade;
    }

    public String getGrade() {
        return this.grade;
    }

    @Override
    public String getKey() {
        return this.assess;
    }

    @Override
    public String toString() {
        return "{" + this.assess + ": " + this.grade + "}";
    }
}




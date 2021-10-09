
public class Assessment implements Keyable{
    private final String ass;
    private final String grade;

    Assessment(String assess, String grade){
        this.ass = assess;
        this.grade = grade;
    }

    String getGrade(){
        return this.grade;
    }

    public String getKey(){
        return this.ass;
    }

    public String toString(){
        return "{" + this.ass + ": " + this.grade + "}";
    }
}

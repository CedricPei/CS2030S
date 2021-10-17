import java.util.Map;

public class Roster extends KeyableMap<Student> {
    Roster(String key) {
        super(key);
    }

    Roster(String key, Map<String, Student> map) {
        super(key,map);
    }

    public Roster put(Student st) {
        super.put(st);
        return this;
    }

    /**
     * getGrade() method.
     */
    String getGrade(String name,String module,String assessment) {
        Assessment modAssessment = null;
        try {
            Student student = get(name);
            Module stuModule = student.get(module);
            modAssessment = stuModule.get(assessment);
        } catch (NullPointerException e) {
            return String.format("No such record: %s %s %s", name, module, assessment);
        }
        if (modAssessment == null) {
            return String.format("No such record: %s %s %s", name, module, assessment);
        }
        return modAssessment.getGrade();
    }
}
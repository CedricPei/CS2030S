import java.util.Map;
import java.util.Optional;

public class Roster extends KeyableMap<Student> {
    Roster(String key) {
        super(key);
    }

    Roster(String key, Map<String, Student> map) {
        super(key,map);
    }

    public Roster put(Student st) {
        this.getMap().put(st.getKey(),st);
        return this;
    }

    String getGrade(String id, String mod, String ass) {
        Optional<String> op = 
            this.get(id).flatMap(x -> x.get("mod")).flatMap(x -> x.get(ass)).map(x -> x.getGrade());
        Optional<String> a = 
            get(id).flatMap(x -> x.get(mod)).flatMap(x -> x.get(ass)).map(Assessment::getGrade);
        return a.orElse(String.format("No such record: %s %s %s", id, mod, ass));
    }
}
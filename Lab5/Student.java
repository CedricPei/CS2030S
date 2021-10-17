import java.util.Map;

public class Student extends KeyableMap<Module> {
    Student(String key) {
        super(key);
    }

    Student(String key, Map<String, Module> map) {
        super(key,map);
    }

    public Student put(Module md) {
        super.put(md);
        return this;
    }
}


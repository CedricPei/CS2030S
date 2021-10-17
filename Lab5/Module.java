import java.util.HashMap;
import java.util.Map;

public class Module extends KeyableMap<Assessment> {
    Module(String key) {
        super(key);
    }

    Module(String key, Map<String, Assessment> map) {
        super(key,map);
    }

    Module put(Assessment ass) {
        super.put(ass);
        return this;
    }
}



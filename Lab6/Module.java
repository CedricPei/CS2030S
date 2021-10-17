import java.util.HashMap;
import java.util.Map;


public class Module extends KeyableMap<Assessment> {
    Module(String key) {
        super(key);
    }

    Module(String key, Map<String, Assessment> map) {
        super(key,map);
    }

    public Module put(Assessment as) {
        this.getMap().put(as.getKey(),as);
        return this;
    }

    @Override
    public String toString() {
        String k = this.getKey();
        if (getMap().size() > 0) {
            k = k + ": {";
            for (Map.Entry<String, Assessment> e : getMap().entrySet()) {
                k = k + e.getValue().toString() + ", ";
            }
            k = k.substring(0, k.length() - 2);
            k = k + "}";
        } else if (getMap().size() == 0) {
            k = k + ": {}";
        }
        return k;
    }
}



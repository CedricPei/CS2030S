import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

class KeyableMap<T> implements Keyable {
    private final String key;
    private final Map<String, T> map;

    KeyableMap(String key) {
        this.key = key;
        this.map = new HashMap<>();
    }

    KeyableMap(String key, Map<String, T> map) {
        this.key = key;
        this.map = map;
    }

    @Override
    public String getKey() {
        return this.key;
    }

    public Map<String, T> getMap() {
        return this.map;
    }

    Optional<T> get(String str) {
        for (Map.Entry<String, T> e: map.entrySet()) {
            if (e.getKey().equals(str)) {
                return Optional.ofNullable(e.getValue());
            }
        }
        return Optional.ofNullable(map.get(str));
    }

    @Override
    public String toString() {
        List<T> list = new ArrayList<T>(map.values());
        String result = list.toString();
        result = result.substring(1,result.length() - 1);
        return key + ": {" + result + "}";
    }
}


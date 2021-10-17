import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class KeyableMap<T extends Keyable> implements Keyable {
    private final String key;
    private final Map<String, T> map;

    public Map<String,T> getMap() {
        return this.map;
    }

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

    T get(String str) {
        return map.get(str);
    }

    KeyableMap<T> put(T item) {
        map.put(item.getKey(),item);
        return this;
    }

    @Override
    public String toString() {
        List<T> list = new ArrayList<T>(map.values());
        String result = list.toString();
        result = result.substring(1,result.length() - 1);
        return key + ": {" + result + "}";
    }
}


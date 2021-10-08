import java.util.HashMap;
import java.util.Map; 

public class Module extends KeyableMap<Assessment>{
	Module(String key) {
		super(key);
	}
	
	Module(String key, Map<String, Assessment> map) {
		super(key,map);
	}
	
	public Module put(Assessment item) {
		this.getMap().put(item.getKey(), item);
		return this;
	}
	
    public String toString(){
        String k = this.getKey();
        if (getMap().size() > 0){
            k = k + ": {";
            for (Map.Entry<String, Assessment> e: getMap().entrySet()){
                k = k + e.getValue().toString() + ", ";
            }
            k = k.substring(0, k.length()-2);
            k = k + "}";
        } else if (getMap().size() == 0) {
        	k = k + ": {}";
        }
        return k;
    }
/*class Module implements Keyable{
    private final String module;
    private Map<String, Assessment> hm;

    Module(String name){
        this.module = name;
        hm = new HashMap<String, Assessment>();
    }

    Module(String name, Map<String, Assessment> map){
        this.module = name;
        this.hm = map;
    }

    public String getKey(){
        return this.module;
    }
    
    Map<String, Assessment> getMap(){
        return this.hm;
    }

    Module put(Assessment info){
        hm.put(info.getKey(), info);
        return new Module(this.getKey(), this.getMap());
    }

    Assessment get(String ass){
        for (Map.Entry<String, Assessment> e: hm.entrySet()){
            if (e.getKey().equals(ass)){
                //String k = e.getValue().toString();
                //k = k.substring(1, k.length()-1);
                return e.getValue();
               //System.out.println(k);
            }
        }
        return null;
    }
    public String toString(){
        String k = this.module;
        if (hm.size() > 0){
            k = k + ": {";
            for (Map.Entry<String, Assessment> e: hm.entrySet()){
                k = k + e.getValue().toString() + ", ";
            }
            k = k.substring(0, k.length()-2);
            k = k + "}";
        } else if (hm.size() == 0) {
        	k = k + ": {}";
        }
        return k;
    }*/
}
        

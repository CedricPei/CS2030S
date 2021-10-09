import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional; 

//public abstract class KeyableMap<String, T> implements Keyable<String> {
//public abstract class KeyableMap<T extends Keyable> {
class KeyableMap<T /* extends Keyable */> implements Keyable{
	private final String key;
	private final Map<String, T> map;
	
	KeyableMap(String key){
		this.key = key;
		this.map = new HashMap<>();
	}
	
	KeyableMap(String key, Map<String, T> map){
		this.key = key;
		this.map = map;	
	}
	//@Override
	public String getKey() {
		return this.key;
	}
	
	public Map<String, T> getMap(){
		return this.map;
	}

	
	/*
	 * T get(String modname) { for (Map.Entry<String, T> e: map.entrySet()){ if
	 * (e.getKey().equals(modname)){ //String k = e.getValue().toString(); //k =
	 * k.substring(1, k.length()-1); return e.getValue(); //System.out.println(k); }
	 * } return null; }
	 */
	
	Optional<T> get(String item) {
		//if (modname == null)
		for (Map.Entry<String, T> e: map.entrySet()){
            if (e.getKey().equals(item)){
                return Optional.ofNullable(e.getValue());
            }
        }
        return Optional.ofNullable(map.get(item)); //actl am confused
	}
	
	@Override
	public String toString() {
		List<T> list = new ArrayList<T>(map.values());
		String result = list.toString();
		result = result.substring(1,result.length() - 1);
		return key
				+ ": {" + result + "}";
	}
	

}
	
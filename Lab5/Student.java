import java.util.Map;

public class Student extends KeyableMap<Module>{
	Student(String key) {
		super(key);
	}

	Student(String key, Map<String, Module> map) {
		super(key,map);
	}

	//@Override //to change
	public Student put(Module item) {
		this.getMap().put(item.getKey(), item);
		return this;
	}
	
	//public Student get(String)
}

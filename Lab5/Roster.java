import java.util.Map;
import java.util.Optional;

public class Roster extends KeyableMap<Student> {
	Roster(String key) { //key means id
		super(key);
	}
	
	Roster(String key, Map<String, Student> map) {
		super(key,map);
	}

	public Roster put(Student item) {
		this.getMap().put(item.getKey(), item);
		return this;
	}
	
	String getGrade(String id, String mod, String ass){
		
		Optional<String> op = this.get(id).flatMap(x -> x.get("mod")).flatMap(x -> x.get(ass)).map(x -> x.getGrade());
		Optional<String> a = get(id).flatMap(x -> x.get(mod)).flatMap(x -> x.get(ass)).map(Assessment::getGrade);
		return a.orElse(String.format("No such record: %s %s %s", id, mod, ass));
		/*
		 * this.get(student).flatMap(x -> x.get(module)).flatMap(x ->
		 * x.get(assessment)).map(Assessment::getGrade) .orElse(errorString);
		 */
		
		//this.get(id).flatMap(x -> x.get("mod")).flatMap(x -> x.get(ass)).map(Assessment::getGrade);
		
		/*
		 * rostered.get(a).ifPresentOrElse( x -> x.get(b).ifPresentOrElse(
		 * 
		 * y -> y.get(c).ifPresentOrElse(
		 * 
		 * z -> z.getGrade(),
		 * 
		 * () -> {rostered.put(x.put(y.put(ass)));}),
		 * 
		 * () -> {rostered.put(x.put(mod));}),
		 * 
		 * () -> {rostered.put(id);});
		 */
	}
}

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("Level 1"); System.out.println(new Assessment("Lab1",
		 * "B")); System.out.println(new Assessment("Lab1", "B").getGrade());
		 * System.out.println(new Assessment("Lab1", "B").getKey());
		 * System.out.println(); System.out.println("Level 2"); System.out.println(new
		 * Module("CS2040")); System.out.println(new Module("CS2040").getKey());
		 * System.out.println(new Module("CS2040").put(new Assessment("Lab1", "B")));
		 * System.out.println(new Module("CS2040").put(new Assessment("Lab1",
		 * "B")).put(new Assessment("Lab2","A+"))); System.out.println(new
		 * Module("CS2040").put(new Assessment("Lab1", "B")).put(new
		 * Assessment("Lab2","A+")).get("Lab2")); System.out.println(new
		 * Module("CS2040").put(new Assessment("Lab1", "B")).put(new
		 * Assessment("Lab2","A+")).get("Lab3")); System.out.println();
		 * System.out.println("Level 3"); System.out.println(new Student("Tony").put(new
		 * Module("CS2040").put(new Assessment("Lab1", "B")))); System.out.println(new
		 * Student("Tony").put(new Module("CS2040").put(new Assessment("Lab1",
		 * "B"))).get("CS2040")); Student natasha = new Student("Natasha");
		 * System.out.println(natasha.put(new Module("CS2040").put(new
		 * Assessment("Lab1", "B")))); System.out.println(natasha.put(new
		 * Module("CS2030").put(new Assessment("PE", "A+")).put(new Assessment("Lab2",
		 * "C")))); System.out.println();
		 */
		/*
		 * System.out.println("Level 4"); Student natashaaaa = new Student("Natasha");
		 * natashaaaa.put(new Module("CS2040").put(new Assessment("Lab1", "B")));
		 * natashaaaa.put(new Module("CS2030").put(new Assessment("PE", "A+")).put(new
		 * Assessment("Lab2", "C"))); Student tonystank = new Student("Tony");
		 * tonystank.put(new Module("CS1231").put(new Assessment("Test", "A-")));
		 * tonystank.put(new Module("CS2100").put(new Assessment("Test", "B")).put(new
		 * Assessment("Lab1", "F"))); Roster roster = new
		 * Roster("AY1920").put(natashaaaa).put(tonystank); System.out.println(roster);
		 */
		//System.out.println(roster.get("Tony").flatMap(x -> x.get("CS1231")).flatMap(x -> x.get("Test")).map(Assessment::getGrade));
		//System.out.println(roster.getGrade("Tony","CS1231","Exam"));
		//System.out.println(roster.getGrade("Steve","CS1010","Lab1"));
		//System.out.println(roster.get("Steve").flatMap(x -> x.get("CS1010")).flatMap(x -> x.get("Lab1")).map(Assessment::getGrade));
		//System.out.println(roster.get("Natasha").flatMap(x -> x.get("CS2040")).flatMap(x -> x.get("Lab1")).map(Assessment::getGrade));
		
		/*
		 * System.out.println(roster.getGrade("Tony","CS1231","Test"));
		 * System.out.println(); System.out.println();
		 */
		//Map<String, Map> bigbigMap = new HashMap<String, Map>();
		Scanner sc = new Scanner(System.in);
		int numOfCommands = sc.nextInt();
		//sc.nextLine();
		Roster rostered = new Roster("AY1920");
		 for (int i = 0; i < numOfCommands; i++) {
	            String a = sc.next(); //name
	            String b = sc.next(); //module
	            String c = sc.next(); // ass
	            String d = sc.next(); // grade
	           
	            
	            Assessment ass = new Assessment(c, d);
	            Module mod = new Module(b).put(ass);	
	            Student id = new Student(a).put(mod);

				
				  rostered.get(a).ifPresentOrElse( x -> x.get(b).
						  
						  ifPresentOrElse( y -> y.get(c).
								  
								  ifPresentOrElse(z -> z.getGrade(),
				  
				  () -> {rostered.put(x.put(y.put(ass)));}),
				  
				  () -> {rostered.put(x.put(mod));}),
				  
				  () -> {rostered.put(id);});
				 
		 }
		 //int i = 8;
		 //int j = 0;
		 while (/*j < 8*/sc.hasNext()) {
	            String student = sc.next();
	            String module = sc.next();
	            String assessment = sc.next();

	            System.out.println(rostered.getGrade(student, module, assessment));
	            //j++;
	        }
		 
		 


	}

}

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    /**
     * Main Method.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfCommands = sc.nextInt();
        Roster rostered = new Roster("AY1920");
        for (int i = 0; i < numOfCommands; i++) {
            String a = sc.next(); //name
            String b = sc.next(); //module
            String c = sc.next(); // ass
            String d = sc.next(); // grade
            Assessment ass = new Assessment(c, d);
            Module mod = new Module(b).put(ass);
            Student id = new Student(a).put(mod);
            rostered.get(a).ifPresentOrElse(
                x -> x.get(b).ifPresentOrElse(
                    y -> y.get(c).ifPresentOrElse(z -> z.getGrade(),
                        () -> { 
                            rostered.put(x.put(y.put(ass))); }),
                    () -> { 
                        rostered.put(x.put(mod)); }),
                () -> { 
                    rostered.put(id); });
        }
        while (sc.hasNext()) {
            String student = sc.next();
            String module = sc.next();
            String assessment = sc.next();
            System.out.println(rostered.getGrade(student, module, assessment));
        }
    }
}
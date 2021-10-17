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
            Module mod = new Module(b);
            mod.put(ass);
            Student id = new Student(a);
            id.put(mod);
            Optional.ofNullable(rostered.get(a)).ifPresentOrElse(
                x -> Optional.ofNullable(x.get(b)).ifPresentOrElse(
                    y -> Optional.ofNullable(y.get(c)).ifPresentOrElse(z -> z.getGrade(),
                        () ->
                            y.put(ass)),
                    () ->
                        x.put(mod)),
                () ->
                    rostered.put(id));
        }
        while (sc.hasNext()) {
            String student = sc.next();
            String module = sc.next();
            String assessment = sc.next();
            String grade = rostered.getGrade(student, module, assessment);
            System.out.println(grade);
        }
    }
}
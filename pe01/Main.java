import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //take Request as input
        Request request = getRequest(scanner);
        //ArrayList of possible bookings
        List<Booking> bookings = new ArrayList<Booking>();
        //Populate bookings list
        populateBookings(request, scanner, bookings);
        //Sort bookings list
        Collections.sort(bookings);
        //Print output for bookings
        printBookings(bookings);
        
        scanner.close();
    }

    private static Request getRequest(Scanner scanner) {
        return new Request(scanner.nextInt(), scanner.nextInt(),
                scanner.nextInt());
    }

    private static void populateBookings(Request request, Scanner scanner, 
            List<Booking> bookings) {
        while (scanner.hasNext()) {
            String driverType = scanner.next();
            if (driverType.equals("NormalCab")) {
                CarDriver driver = new NormalCab(scanner.next(), scanner.nextInt());
                Booking booking1 = new Booking(driver, new JustRide(), request);
                Booking booking2 = new Booking(driver, new TakeACab(), request);
                bookings.add(booking1);
                bookings.add(booking2);
                
            } else if (driverType.equals("PrivateCar")) {
                CarDriver driver = new PrivateCar(scanner.next(), scanner.nextInt());
                Booking booking1 = new Booking(driver, new JustRide(), request);
                Booking booking2 = new Booking(driver, new ShareARide(), request);
                bookings.add(booking1);
                bookings.add(booking2);
            }
        }
    }

    private static void printBookings(List<Booking> bookings) {
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }

}



import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01ParkingLot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> cars = new LinkedHashSet<>();
        String[] input = scanner.nextLine().split(", ");
        while (!input[0].equals("END")) {
            String direction = input[0];
            String number = input[1];
            if (direction.equals("IN")) {
                cars.add(number);
            } else if (direction.equals("OUT")) {
                cars.remove(number);
            }
            input = scanner.nextLine().split(", ");
        }
        if (cars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car : cars) {
                System.out.println(car);
            }
        }
    }
}

package P01CarInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {

        }
        car.setBrand("Chevrolet");
        car.setModel("Impala");
        car.setHp(390);
        carInfo(car);
    }

    public static void carInfo(Car car) {
        System.out.println(String.format("The car is: %s %s - %d HP.", car.getBrand(), car.getModel(), car.getHp()));
    }
}


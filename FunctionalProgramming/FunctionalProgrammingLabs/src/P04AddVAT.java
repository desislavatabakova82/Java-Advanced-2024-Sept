import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P04AddVAT {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Double> input = Arrays.stream(scanner.nextLine().split(", ")).map(Double::parseDouble).collect(Collectors.toList());
        Function<Double, Double> priceWithVAT = price -> price * 1.2;
        Consumer<Double> printPriceWithVAT = price -> System.out.printf("%.2f\n", price);
        System.out.println("Prices with VAT:");
        input.stream().map(priceWithVAT).forEach(printPriceWithVAT);

    }
}

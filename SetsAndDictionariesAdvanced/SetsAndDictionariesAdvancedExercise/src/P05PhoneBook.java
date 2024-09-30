import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05PhoneBook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, String> data = new HashMap<>();
        while (!command.equals("search")) {
            String[] dataInput = command.split("-");
            String name = dataInput[0];
            String phoneNumber = dataInput[1];
            data.putIfAbsent(name, "");
            data.put(name, phoneNumber);
            command = scanner.nextLine();
        }
        while(!command.equals("stop")){
if(data.containsKey(command)){
    for (String names: data.keySet()         ) {

    }
    System.out.println();
}
            command= scanner.nextLine();

        }
    }
}

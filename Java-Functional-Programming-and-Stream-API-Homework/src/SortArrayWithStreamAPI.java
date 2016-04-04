import java.util.Arrays;
import java.util.Scanner;


public class SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        String command = scan.nextLine();
        if (command.equals("Ascending")) {
            Arrays.stream(input).map(d -> Integer.parseInt(d))
                    .sorted().forEach(d -> System.out.print(d + " "));
        } else if (command.equals("Descending")) {
            Arrays.stream(input).map(d -> Integer.parseInt(d))
                    .sorted((d1, d2) -> d2.compareTo(d1)).forEach(d -> System.out.print(d + " "));
        }
    }
}

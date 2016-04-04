import java.util.Arrays;
import java.util.Scanner;

public class FillterArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        Arrays.stream(input).filter(s -> s.length() > 3)
                .forEach(s -> System.out.print(s + " "));
    }
}

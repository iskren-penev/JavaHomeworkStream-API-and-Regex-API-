import java.util.Scanner;
import java.util.regex.*;

public class ExtractWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Pattern pat = Pattern.compile("[A-Za-z]{2,}");
        Matcher match = pat.matcher(input);
        while (match.find()) {
            System.out.print(match.group() + " ");
        }
        System.out.println();
    }
}

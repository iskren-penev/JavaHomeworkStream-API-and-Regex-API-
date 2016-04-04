import java.util.Scanner;
import java.util.regex.*;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile(
                "[\\-\\.A-Za-z0-9]+@[A-Za-z\\.\\-]+\\.[a-z]+");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}

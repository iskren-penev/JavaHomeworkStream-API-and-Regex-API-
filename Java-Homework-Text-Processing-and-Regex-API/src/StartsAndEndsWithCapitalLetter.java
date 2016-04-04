import java.util.Scanner;
import java.util.regex.*;

public class StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        Pattern pattern = Pattern.compile("\\b[A-Z][A-Za-z]*[A-Z]\\b");
        for (String word : input) {
            Matcher match = pattern.matcher(word);
            if (match.find()) {
                System.out.print(match.group() + " ");
            }
        }
        System.out.println();


    }
}

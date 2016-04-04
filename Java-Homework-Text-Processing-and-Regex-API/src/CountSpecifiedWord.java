import java.util.Scanner;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\W+");
        int counter = 0;
        String pattern = scan.nextLine();
        for (String word: input) {
            if (word.equals(pattern))counter++;
        }
        System.out.println(counter);
    }
}

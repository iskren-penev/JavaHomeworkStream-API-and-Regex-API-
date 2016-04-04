import java.util.Scanner;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().toLowerCase().split("\\s+");
        String pattern = scan.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i < input.length ; i++) {
            count +=countSubstrings(input[i], pattern);
        }
        System.out.println(count);
    }
    public static int countSubstrings(String word, String pattern){
        int counter = 0;
        int index = 0;
        while ((index = word.indexOf(pattern, index)) != -1) {
            index++;
            /*if you don't want to count the overlapping patterns use
            index += pattern.lenght; */
            counter++;
        }
        return counter;
    }
}


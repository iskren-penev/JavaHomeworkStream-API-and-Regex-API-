import java.util.LinkedHashMap;
import java.util.Scanner;

public class ExchangeableWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        boolean areExchangeable = false;

        /*create a linkedmap for each word and fill it with each unique character
        * as value for each character put it's index + 1*/
        LinkedHashMap<Character, Integer> set1 = new LinkedHashMap<>();
        LinkedHashMap<Character, Integer> set2 = new LinkedHashMap<>();


        for (int i = 0; i < word1.length(); i++) {
            if (set1.containsKey(word1.charAt(i))) {
                continue;
            }
            set1.put(word1.charAt(i), i + 1);

        }
        for (int i = 0; i < word2.length(); i++) {
            if (set2.containsKey(word2.charAt(i))) {
                continue;
            }
            set2.put(word2.charAt(i), i + 1);
        }
        /*next we need to calculate the sum of the values in each map*/
        int valueSum1 = 0;
        int valueSum2 = 0;
        for (Character ch : set1.keySet()) {
            int value = set1.get(ch);
            valueSum1 += value;
        }
        for (Character ch : set2.keySet()) {
            int value = set2.get(ch);
            valueSum2 += value;
        }

        /*if the sums are equal, we change the boolean to true*/
        if (valueSum1 == valueSum2) {
            areExchangeable = true;
        }
        System.out.println(areExchangeable);
    }
}


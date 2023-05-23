package OOP;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// (“Smith”,30), (“Anderson", 31), (“Lewis", 29),  and ("Cook", 29). 

public class Main {
    public static void main(String[] args) {
        String text = "Good morning. Have a good class. " + "Have a good visit. Have fun!";
        Map<String, Integer> sortedWordsCount = new TreeMap<>(countTheOccurenceOfLetters(text));
        System.out.println(sortedWordsCount);
    }

    static Map<String, Integer> countTheOccurenceOfLetters(String text) {
        Map<String, Integer> lettersCount = new HashMap<>();
        text = text.replaceAll("\\W+", "");
        String[] letters = text.split("");

        for (String word : letters) {
            word = word.toLowerCase();
            if (lettersCount.size() > 0 && lettersCount.containsKey(word)) {
                Integer value = lettersCount.get(word);
                value++;
                lettersCount.put(word, value);
                continue;
            }
            lettersCount.put(word, 1);
        }
        return lettersCount;
    }
}

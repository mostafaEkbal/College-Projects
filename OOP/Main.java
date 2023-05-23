package OOP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// (“Smith”,30), (“Anderson", 31), (“Lewis", 29),  and ("Cook", 29). 

public class Main {
    public static void main(String[] args) {
        // String text = "Good morning. Have a good class. " + "Have a good visit. Have
        // fun!";
        // Map<String, Integer> sortedWordsCount = new
        // TreeMap<>(countTheOccurenceOfWords(text));
        // System.out.println(sortedWordsCount);
        bulkOp();
    }

    static Map<String, Integer> countTheOccurenceOfWords(String text) {
        Map<String, Integer> wordsCount = new HashMap<>();
        String[] words = text.trim().split("\\W+");

        for (String word : words) {
            word = word.toLowerCase();
            if (wordsCount.size() > 0) {
                if (wordsCount.containsKey(word)) {
                    Integer value = wordsCount.get(word);
                    value++;
                    wordsCount.put(word, value);
                    continue;
                }
            }
            wordsCount.put(word, 1);
        }
        return wordsCount;
    }

    static void bulkOp() {
        Integer[] array1 = { 3, 4, 5, 2, 1 };
        Integer[] array2 = { 2, 3, 7, 8, 9 };
        Set<Integer> s1 = new LinkedHashSet<Integer>(Arrays.asList(array1));
        Set<Integer> s2 = new LinkedHashSet<Integer>(Arrays.asList(array2));
        System.out.println(s1);
        System.out.println(s2);
        s1.addAll(s2);
        System.out.println(s1);
        s1.retainAll(s2);
        System.out.println(s1);
        s1.removeAll(s2);
        System.out.println(s1);
    }
}

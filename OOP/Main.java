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
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Smith", 30);
        ageMap.put("Anderson", 31);
        ageMap.put("Lewis", 29);
        ageMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(ageMap + "\n");
        System.out.println("\nThe age for " + "Lewis is " + ageMap.get("Lewis"));
        System.out.println("Names for those whose ag >= 30 are: ");

        for (String name : ageMap.keySet()) {
            if (ageMap.get(name) >= 30)
                System.out.println(name);
        }

        Map<String, Integer> ageTreeMap = new TreeMap<>(ageMap);
        System.out.println(ageTreeMap);
    }
}

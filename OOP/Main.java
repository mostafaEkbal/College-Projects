package OOP;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
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

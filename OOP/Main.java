package OOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle obj1 = new Circle(5);
        Circle obj2 = new Circle(20);
        Circle obj3 = new Circle(40);
        ArrayList<Circle> circleList = new ArrayList<Circle>(4);
        circleList.add(0, obj3);
        circleList.add(obj2);
        circleList.add(obj1);
        Deal_Circles.writeToFile(circleList);
        Deal_Circles.printCircles(Deal_Circles.readFromFile());
    }

    static void arrayListMethodsTest(ArrayList<String> arrayList) {
        arrayList.add("London");
        arrayList.add("Paris");
        arrayList.add("Denver");
        arrayList.add("Miami");
        arrayList.add("Tokyo");
        arrayList.add("Seoul");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains("Miami"));
        System.out.println(arrayList.indexOf("Denver"));
        arrayList.add(4, "Paris");
        arrayList.remove("Paris");
    }

    static void collectionsMethodsTest(ArrayList<Integer> arraylist) {
        System.out.println(arraylist);
        Collections.reverse(arraylist);
        System.out.println(arraylist);
        System.out.println(Collections.max(arraylist));
        System.out.println(Collections.min(arraylist));
        Integer sum = 0;
        for (Integer num : arraylist)
            sum += num;
        System.out.println(sum);
        Collections.shuffle(arraylist);
        System.out.println(arraylist);
        Collections.sort(arraylist);
        System.out.println(arraylist);
    }

    static String[] converStringArrayListToArray(ArrayList<String> arrayList) {
        String[] array = new String[arrayList.size()];
        arrayList.toArray(array);
        return array;
    }

    static ArrayList<Integer> converIntegerArrayToArrayList(Integer[] array) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(array));
        return arrayList;
    }
}

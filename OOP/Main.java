package OOP;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<String>();
        cityList.add("London");
        cityList.add("Paris");
        cityList.add("Denver");
        cityList.add("Miami");
        cityList.add("Tokyo");
        cityList.add("Seoul");
        System.out.println(cityList);
        System.out.println(cityList.size());
        System.out.println(cityList.contains("Miami"));
        System.out.println(cityList.indexOf("Denver"));
        cityList.add(4, "Paris");
        cityList.remove("Paris");
        String[] cityArray = converArrayListToArray(cityList);
        System.out.println("This is an Array " + Arrays.toString(cityArray) + "\nAnd this is an ArrayList " + cityList);
    }

    static String[] converArrayListToArray(ArrayList<String> arrayList) {
        String[] array = new String[arrayList.size()];
        arrayList.toArray(array);
        return array;
    }
}

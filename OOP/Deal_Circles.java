package OOP;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Deal_Circles {
    private static File fw = new File("Circles.txt");

    public static void writeToFile(ArrayList<Circle> object) {
        try {
            PrintWriter pr = new PrintWriter(fw);
            for (Circle circle : object) {
                pr.println(circle.getRadius());
            }
            pr.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public static ArrayList<Circle> readFromFile() {
        ArrayList<Circle> list = new ArrayList<Circle>();
        try {
            Scanner sc = new Scanner(fw);
            double r;
            while (sc.hasNext()) {
                r = sc.nextDouble();
                list.add(new Circle(r));
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return list;
    }

    public static void printCircles(ArrayList<Circle> list) {
        for (Circle circle : list) {
            System.out.println(circle.getArea());
        }
    }
}
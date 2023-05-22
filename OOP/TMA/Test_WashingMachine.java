package OOP.TMA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Test_WashingMachine {
    public static void main(String[] args) {
        File fw = new File("C:/Users/mosta/WebdevelopmentProjects/CollegeProjects/OOP/TMA/WashingMashine.txt");
        ArrayList<WashingMashine> washingMachinesList = new ArrayList<WashingMashine>();
        try {
            Scanner sc = new Scanner(fw);
            String brandName;
            int productionYear, capacity;
            while (sc.hasNext()) {
                brandName = sc.next();
                productionYear = sc.nextInt();
                capacity = sc.nextInt();
                WashingMashine obj = new WashingMashine(brandName, productionYear, capacity);
                if (washingMachinesList.size() != 0) {

                    if (washingMachinesList.contains(obj)) {
                        System.out.println("program terminated, you can't add duplicates");
                        break;

                    }
                }
                washingMachinesList.add(obj);
            }
            sc.close();
            Collections.sort(washingMachinesList, (o1, o2) -> o1.getBrandName().compareTo(o2.getBrandName()));
            System.out.println(washingMachinesList);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

}

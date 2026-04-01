package Phase_1.week_2.part_1;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchProductInList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Phone", "Laptop", "Camera", "Tablet", "Mouse", "Keyboard", "Charger", "Speaker", "Watch", "Printer"));

        System.out.print("Laptop contain : ");
        System.out.println(list.contains("Laptop"));

        System.out.print("index of phone: ");
        System.out.println(list.indexOf("Phone"));

        int count = 0;
        for (String l : list) {
            if (l.contains("a")  || l.contains("A")) count++;
        }

        System.out.println("lists which contains 'a': " + count);
    }
}

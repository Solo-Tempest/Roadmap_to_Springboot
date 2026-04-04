package Phase_1.week_2.part_1.hashSet;
import java.util.*;

public class DetectCycleInSequence {
    public static void main(String[] args) {
        int start = 3;
        detectCycle(start);
    }
    public static void detectCycle(int start) {

        Set<Integer> visited = new HashSet<>();
        int current = start;

        System.out.print("Sequence: ");

        while (!visited.contains(current)) {
            System.out.print(current + " → ");
            visited.add(current);

            current = (current * 2) % 10;
        }

        System.out.println(current + " ...");

        System.out.println("Cycle detected at: " + current);
        System.out.println("Visited values: " + visited);
    }
}

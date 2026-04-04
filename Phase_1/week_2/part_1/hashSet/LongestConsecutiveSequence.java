package Phase_1.week_2.part_1.hashSet;
import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};

        System.out.println("Longest consecutive length: " + longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        // Step 1: Add all elements to set
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        // Step 2: Check each number
        for (int num : set) {

            // Only start if it's the beginning of a sequence
            if (!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                // Expand forward
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

}

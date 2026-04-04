package Phase_1.week_2.part_1.hashSet;

import java.util.*;

public class FindAllPairsWithTargetSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 2, 4, 8);
        int target = 8;

        List<List<Integer>> result = findPairs(list, target);

        System.out.println("Input: " + list);
        System.out.println("Target: " + target);
        System.out.println("Output: " + result);
    }

    public static List<List<Integer>> findPairs(List<Integer> list, int target) {

        Set<Integer> seen = new HashSet<>();
        Set<String> uniquePairs = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int num : list) {

            int complement = target - num;

            if (seen.contains(complement)) {

                int a = Math.min(num, complement);
                int b = Math.max(num, complement);

                String key = a + "," + b;

                if (!uniquePairs.contains(key)) {
                    result.add(Arrays.asList(a, b));
                    uniquePairs.add(key);
                }
            }

            seen.add(num);
        }

        return result;
    }
}

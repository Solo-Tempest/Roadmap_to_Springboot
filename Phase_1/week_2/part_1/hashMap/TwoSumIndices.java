package Phase_1.week_2.part_1.hashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumIndices {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
    static public int[] twoSum(int[] arr, int target) {
        Map<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++){
            int rem = target - arr[i];
            if(map.containsKey(rem)){
                return new int[] {map.get(rem), i};
            }
            else{
                map.put(arr[i] , i);
            }
        }
        return new int[] { -1 ,-1};
    }

}

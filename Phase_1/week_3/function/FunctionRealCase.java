package Phase_1.week_3.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionRealCase {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        Function<Integer, String> numToString = a -> "Number: " + a;
        System.out.println(convertToString(list, numToString));
    }

    static List<String> convertToString(List<Integer> list, Function<Integer, String> f) {
        List<String> ans = new ArrayList<>();
        for (int i : list) {
            ans.add(f.apply(i));
        }
        return ans;
    }
}

package Phase_1.week_2.part_1.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rotateByK {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int k = 6;
        if (list.isEmpty()) {
            System.out.println(list);
            return;
        }
        int turn = k % list.size();
        List<Integer> ans = new ArrayList<>();
        ans.addAll(list.subList(list.size()-turn , list.size()));
        ans.addAll(list.subList(0 ,list.size()-turn ));
        System.out.println(ans);

    }
}

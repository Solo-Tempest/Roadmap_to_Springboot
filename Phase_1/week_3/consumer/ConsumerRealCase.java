package Phase_1.week_3.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerRealCase {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Consumer<Integer> square = n -> System.out.println(n * n);
        for (int i : list) {
            square.accept(i);
        }
    }
}

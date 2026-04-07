package Phase_1.week_3.consumer;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Shyam", "Mohan");
        Consumer<String> print = s -> System.out.println(s);

        for (String s : names){
            print.accept(s);
        }

    }
}

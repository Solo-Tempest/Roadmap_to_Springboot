package Phase_1.week_3.consumer;
import java.util.*;
import java.util.function.Consumer;

public class ConsumerChaining {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Shyam", "Mohan");

        Consumer<String> print = s -> System.out.println(s);
        Consumer<String> length = s -> System.out.println(s.length());
        Consumer<String> both = print.andThen(length);
        for (String s : names){
            both.accept(s);
        }

    }
}

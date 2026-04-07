package Phase_1.week_3.consumer;

import java.util.function.Consumer;

public class BasicConsumer {
    public static void main(String[] args) {
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Aditya");
    }
}

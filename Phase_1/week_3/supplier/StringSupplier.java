package Phase_1.week_3.supplier;

import java.util.function.Supplier;

public class StringSupplier {
    public static void main(String[] args) {
        Supplier<String> str = () -> "Hello Student";
        System.out.println(str.get());
    }
}

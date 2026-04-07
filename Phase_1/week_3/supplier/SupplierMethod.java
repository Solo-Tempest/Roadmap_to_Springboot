package Phase_1.week_3.supplier;

import java.util.function.Supplier;

public class SupplierMethod {
    public static void main(String[] args) {
        Supplier<String > s = () -> "Hello, Aditya";
        printValue(s);
        printValue(() -> "Hello, Aditya");
    }
    static void printValue(Supplier<String > s){
        System.out.println(s.get());
    }
}

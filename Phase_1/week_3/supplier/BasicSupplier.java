package Phase_1.week_3.supplier;
import java.util.function.Supplier;

public class BasicSupplier {
    public static void main(String[] args) {
        Supplier<Double> rand = () -> Math.random();
        Supplier<String> str = () -> "Hello Student";
        System.out.println((int)(rand.get() *100));
        System.out.println(str.get());
    }
}

package Phase_1.week_3.supplier;

import java.util.function.Supplier;

public class SupplierRealCase {
    public static void main(String[] args) {
        Supplier<Long> time = () -> System.currentTimeMillis();
        System.out.println(time.get());
    }
}

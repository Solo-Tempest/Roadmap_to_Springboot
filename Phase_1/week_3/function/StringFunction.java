package Phase_1.week_3.function;

import java.util.function.Function;

public class StringFunction {
    public static void main(String[] args) {
        Function<String, String> toupperCase = s -> s.toUpperCase();
        System.out.println(toupperCase.apply("aditya"));
    }
}

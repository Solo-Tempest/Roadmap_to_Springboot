package Phase_1.week_3.lambdas;

public class MultiStatementLambda {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> {
            System.out.println("Calculating...");
            return a * b;
        };
        System.out.println(calculator.compute(2,3));
    }
}
@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}
package Phase_1.week_3.lambdas;

public class LambdaAsArgument {
    public static void main(String[] args) {
        Operation sum = (a, b) -> a + b;
        Operation divide = (a , b) -> a /b;

        execute(sum);
        execute(divide);

        execute((a, b) -> a + b);
        execute((a, b) -> a / b);
    }

    public static void execute(Operation op) {
        System.out.println(op.apply(10, 5));
    }
}
@FunctionalInterface
interface Operation {
    int apply(int a, int b);
}


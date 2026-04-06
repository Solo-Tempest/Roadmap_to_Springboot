package Phase_1.week_3.lambdas;

public class BasicLambda {
    public static void main(String[] args) {
        Greeting greet = () -> System.out.println("Hello java");
        greet.sayHello();
    }
}
@FunctionalInterface
interface Greeting {
    void sayHello();
}

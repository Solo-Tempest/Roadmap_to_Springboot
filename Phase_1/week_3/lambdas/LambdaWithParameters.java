package Phase_1.week_3.lambdas;

public class LambdaWithParameters {
    public static void main(String[] args) {
        Add add = (a, b ) ->  a+b;
        System.out.println(add.sum(2,3));

    }
}
@FunctionalInterface
interface Add {
    int sum(int a, int b);
}

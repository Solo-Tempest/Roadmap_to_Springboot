package Phase_1.week_2.part_2.ExceptionHandling;

public class DivideByZero {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.divide(10,5);
        cal.divide(10 , 0);
        cal.divide(10 , -2);
    }
}

class Calculator{

    void divide(int a , int b){
        try{
            int ans = a/b;
            System.out.println(ans);
        }
        catch(ArithmeticException e){
            System.out.println(" divide by zero is not valid : " + e);
        }
        finally {
            System.out.println("Calculation complete");
        }

    }
}

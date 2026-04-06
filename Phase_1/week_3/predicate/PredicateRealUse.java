package Phase_1.week_3.predicate;
import java.util.*;
import java.util.function.Predicate;

public class PredicateRealUse {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Shyam", "Alexander");
        Predicate<String> length = s -> s.length() > 3;
        compareLength(names , length);
    }
    static void compareLength(List<String> names , Predicate<String> p){
        for (String s : names){
            if (p.test(s)){
                System.out.println(s);
            }
        }
    }
}

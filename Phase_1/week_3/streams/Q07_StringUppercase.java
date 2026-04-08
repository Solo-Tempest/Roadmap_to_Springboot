package Phase_1.week_3.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q07_StringUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ram", "shyam", "mohan");
        List<String> toUppercaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(toUppercaseNames);
        toUppercaseNames.add("new");
        System.out.println(toUppercaseNames);
    }
}

package Phase_1.week_3.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q22_StringProcessing {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ram", "shyam", "mohan", "alex");
        List<String> nameToUpperCase = names.stream()
                .map(String::toUpperCase)
                .filter(name -> name.length() > 4)
                .sorted()
                .toList();
        nameToUpperCase.forEach(System.out::println);
    }
}

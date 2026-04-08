package Phase_1.week_3.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q08_FilterNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ram", "shyam", "mohan" ,"HI");
        List<String> nameLengthGreater = names.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.toList());
        System.out.println(nameLengthGreater);
    }
}

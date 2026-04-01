package Phase_1.week_2.part_1.hashMap;

import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        String sentence = "Java is great and Java is powerful";
        sentence = sentence.toLowerCase();
        String[] words = sentence.split("\\s+");
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
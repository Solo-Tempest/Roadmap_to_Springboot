package Phase_1.week_2.part_1.hashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "aabbcdeef";
        System.out.println(firstUniqChar(s));
    }
    static public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1);
        }
        for(int i = 0 ; i < s.length() ; i++){
            if(map.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}

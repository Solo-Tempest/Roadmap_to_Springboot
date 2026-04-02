package Phase_1.week_2.part_1.hashMap;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagramUsingMap {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        System.out.println(isAnagram(s , t));


    }
    static public boolean isAnagram(String s, String t){
        int n = s.length();
        if (n != t.length())
            return false;
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1);
        }
        for(int i = 0 ; i < t.length() ; i++){
            map.put(t.charAt(i) , map.getOrDefault(t.charAt(i) , 0) - 1);
            if(map.get(t.charAt(i)) < 0 ) return false;
        }
        for(Integer i : map.values()){
            if(i != 0) return false;
        }
        return true;
    }
}

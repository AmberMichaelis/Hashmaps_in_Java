package org.example;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static int hash(String key) {
        int hash = 0;
        for (var ch : key.toCharArray()){
            hash += ch;
            return hash % 100;
        }
        return hash % 100;
    }
    public char getCharacter(String s) {
        Map<Character, Integer> list = new HashMap<>();
        s = s.replaceAll("\\s","");
        System.out.println(s);
        char[] chars = s.toCharArray();
        for (char each : chars) {
            list.merge(each, 1, Integer::sum);
            System.out.println(list);
        }
        for (char one : chars) {
            if (list.get(one) == 1) {
                System.out.println(one);
                return one;
            }
        }
        System.out.println("none found");
        return 0;
    }

    public char findFirstNonRepeatingChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        var chars = s.toCharArray();
        for (var ch : chars) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }
        for (var ch : chars) {
            if (map.get(ch) == 1) return ch;
        }
        return Character.MIN_VALUE;
    }

    public void practiceMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Amber");
        map.put(2, "Marcus");
        map.put(3, "James");
        map.put(null, null);

        for (var item : map.entrySet())
            System.out.println(item);

        map.remove(null);
        var value = map.get(1);
        System.out.println(value);
        System.out.println(map);
    }
}

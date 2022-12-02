package org.example;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public char firstRepeatedCharacter(String s) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (uniqueChars.contains(c)) {
                System.out.println(c);
                return c;
            }
            uniqueChars.add(c);
        }
        System.out.println(uniqueChars);
        return Character.MIN_VALUE;
    }
    public void practiceSet() {
    Set<Integer> set = new HashSet<>();
    int[] numbers = { 1,2,3,3,2,1,4 };
        for (var number : numbers) {
            set.add(number);
        }
            System.out.println(set);
    }
}

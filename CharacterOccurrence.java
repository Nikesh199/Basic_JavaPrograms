package com.simple.examples;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrence {
    public static void main(String[] args) {
        String input = "hello world";
        String inputValue = input.replaceAll("\\s+", "");
        // Count character occurrences
        Map<Character, Integer> characterCount = countCharacterOccurrences(inputValue);

        // Print the result
        characterCount.forEach((character, count) -> System.out.println(character + ": " + count));
    }

    public static Map<Character, Integer> countCharacterOccurrences(String inputValue) {
        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : inputValue.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        return countMap;
    }
}

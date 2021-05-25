package org.example.string.utils;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StringGenerator {

    private static final Random RANDOM = new Random();

    public static String generateRandomString(int length) {
        char[] chars = new char[length];
        List<Character> charsList = RANDOM.doubles(length, 0, 1)
                .map(nextDouble -> nextDouble * 57 + 65)
                .mapToInt(it -> (int) it)
                .mapToObj(rand -> Character.toChars(rand)[0])
                .collect(Collectors.toList());

        for (int i = 0; i < length; i++) {
            chars[i] = charsList.get(i);
        }

        return String.valueOf(chars);
    }
}

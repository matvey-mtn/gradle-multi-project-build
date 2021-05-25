package org.example.string.utils;

import java.util.Random;
import org.junit.jupiter.api.Test;

public class StringGeneratorTest {

    @Test
    public void testDoubleStreamToChars() {
        new Random().doubles(10, 0, 1)
                .map(nextDouble -> nextDouble * 57 + 65)
                .mapToInt(it -> (int) it)
                .mapToObj(rand -> Character.toChars(rand)[0])
                .forEach(System.out::println);
    }

    @Test
    public void generateRandomStringOfLength() {
        int length = 400;
        String randomString = StringGenerator.generateRandomString(length);
        System.out.println(randomString);
        assert randomString.length() == length;
    }
}

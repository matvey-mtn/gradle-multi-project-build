package org.example.text.generator;

import java.util.Random;
import org.example.string.utils.StringGenerator;

public class RandomTextGenerator {

    public static void main(String [] args) throws InterruptedException {
        Random random = new Random();
        while (true) {
            System.out.println(StringGenerator.generateRandomString(random.nextInt(100)));
            Thread.sleep(1000);
        }
    }
}

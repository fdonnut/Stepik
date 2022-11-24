package oop.string_format;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("sam", 23);
        System.out.println(person);

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(6) + 5;
            System.out.println(a);
        }

        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(6) + 1;
            String result = String.format("Выпало число: %s", x);
            System.out.println(result);
        }
    }
}

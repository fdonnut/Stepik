package oop;

import java.util.ArrayList;
import java.util.HashSet;

public class Collect {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add(i);
        }
        for (int number : numbers) {
            System.out.println(number);
        }

        ArrayList<String> names = new ArrayList<>();
        names.add("john");
        names.add("emma");
        names.add("max");
        names.add("olivia");
        names.add("nick");

        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(35);
        ages.add(23);
        ages.add(32);
        ages.add(25);
        ages.add(44);

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            result.add(ages.get(i) + " - " + names.get(i));
        }

        for (String elem : result) {
            System.out.println(elem);
        }

        HashSet<String> name = new HashSet<>();
        name.add("john");
        name.add("max");
        name.add("nick");
        name.add("emma");
        name.add("olivia");
        for (String el : name) {
            System.out.println(el);
        }
    }
}

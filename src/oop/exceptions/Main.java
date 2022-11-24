package oop.exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        try {
            int b = 7 / a;
            int c = Integer.parseInt("ass");
        } catch (ArithmeticException e) {
            System.out.println("/ by zero");
        } catch (Exception e) {
            System.out.println("exception " + e.getClass());
        }
        System.out.println("hello");

        int[] array = new int[5];
        try {
            array[0] = 5;
            array[5] = 23;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index exception");
        }
        System.out.println(array[0]);
    }
}

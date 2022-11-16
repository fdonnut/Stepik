package oop;

public class Rectangle {
    int length;
    int width;

    void setDimens(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void getArea() {
        System.out.println("Square = " + length * width);
    }
}

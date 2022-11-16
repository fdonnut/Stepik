package oop;

public class Box {
    double length;
    double width;
    double height;

    Box() {
        this(10);
    }

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(double size) {
        this(size, size, size);
    }

    void setDimens(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double getVolume() {
        return length * width * height;
    }

    void showVolume() {
        System.out.println(getVolume());
    }
}

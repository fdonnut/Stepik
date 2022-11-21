package oop.inheritance;

public class Rect extends Shape {
    public Rect(int a, int b) {
        super(a, b);
    }

    @Override
    public int getPerimeter() {
        return (getA() + getB()) * 2;
    }
}

package oop.inheritance;

public final class ColoredRect extends Rect {
    private String color;

    public ColoredRect(int a, int b, String color) {
        super(a, b);
        this.color = color;
    }
}

package oop.inheritance;

import oop.Rectangle;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();
        System.out.println(cat.isCanEatPerson());
        System.out.println(lion.isCanEatPerson());
        cat.eat();
        lion.eat();

        Rect rect = new Rect(5, 8);
        ColoredRect coloredRect = new ColoredRect(7, 10, "red");
        Triangle triangle = new Triangle(3, 4, 5);
        rect.showPerimeter();
        triangle.showPerimeter();
        coloredRect.showPerimeter();
    }
}

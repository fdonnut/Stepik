package oop;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.length = 10;
        box.height = 10;
        box.width = 10;
        System.out.println(box.volume());

        Person man = new Person();
        Person woman = new Person();
        Person child = new Person();

        man.name = "john";
        man.age = 45;
        man.weight = 85.0;

        woman.name = "helen";
        woman.age = 40;
        woman.weight = 51.5;

        child.name = "ted";
        child.age = 10;
        child.weight = 20.3;

        System.out.println((man.age + woman.age + child.age) / 3);
    }
}
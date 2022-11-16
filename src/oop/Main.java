package oop;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 30);
        box1.showVolume();
        Box box2 = new Box(5);
        box2.showVolume();

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

        Dog dog = new Dog();
        dog.name = "Spike";
        dog.breed = "bulldog";
        dog.weight = 20;
        dog.speed = 5;
        System.out.println(dog.getInfo());
        dog.run();

        Rectangle rect = new Rectangle();
        rect.setDimens(30, 40);
        rect.getArea();

        Employee employee = new Employee("john", "driver", 100_000);
        employee.showInfo();

        System.out.println(MyMath.multiple(10,5));

        Monster monster = new Monster();
        monster.voice();
    }
}
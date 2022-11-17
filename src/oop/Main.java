package oop;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 30);
        box1.showVolume();
        Box box2 = new Box(5);
        box2.showVolume();

        Person man = new Person("john", 45);
        Person woman = new Person("helen", 40);
        Person child = new Person("ted", 10);

        System.out.println((man.getAge() + woman.getAge() + child.getAge()) / 3);

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

        Box current = new Box(10);
//        Box another = new Box(current);
//        System.out.println(current.compare(another));
        Box another = current.increase();
        current.showVolume();
        another.showVolume();

        System.out.println(MyMath.length(7));
        System.out.println(MyMath.area(5));
        System.out.println(MyMath.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));


    }
}
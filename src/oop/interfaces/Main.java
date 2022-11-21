package oop.interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(bird);
        animals.add(fish);
        for (Animal animal : animals) {
            animal.eat();
        }
        dog.run();
        cat.run();

        Director director = new Director();
        Programmer programmer = new Programmer();
        Chef chef = new Chef();
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(programmer);
        workers.add(chef);
        for (Worker worker : workers) {
            worker.work();
        }

        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(programmer);
        drivers.add(chef);
        for (Driver driver : drivers) {
            driver.drive();
        }

        director.force(programmer);
        director.force(new Worker() {
            @Override
            public void work() {
                System.out.println("работаю!!!");
            }
        });

        Client client = new Client();
//        WaiterBob waiterBob = new WaiterBob();
//        client.makeOrder(waiterBob, "пицца");
        client.makeOrder(new Waiter() {
            @Override
            public void bringOrder(String dish) {
                System.out.println("Я вам принес: " + dish);
            }
        }, "пицца");
    }
}

package oop.interfaces;

public class Programmer implements Worker, Driver {
    @Override
    public void drive() {
        System.out.println("программист водит машину");
    }

    @Override
    public void work() {
        System.out.println("программист работает");
    }
}

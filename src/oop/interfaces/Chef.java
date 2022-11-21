package oop.interfaces;

public class Chef implements Worker, Driver {
    @Override
    public void drive() {
        System.out.println("повар водит машину");
    }

    @Override
    public void work() {
        System.out.println("повар работает");
    }
}

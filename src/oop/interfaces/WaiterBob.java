package oop.interfaces;

public class WaiterBob implements Waiter {
    @Override
    public void bringOrder(String dish) {
        System.out.println("Я вам принес: " + dish);
    }
}

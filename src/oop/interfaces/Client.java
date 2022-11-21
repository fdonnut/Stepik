package oop.interfaces;

public class Client {
    public void makeOrder(Waiter waiter, String dish) {
        waiter.bringOrder(dish);
    }
}

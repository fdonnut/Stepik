package oop.multithreading;

import java.util.Random;

public class GuessNumber {
    static boolean winner = false;

    public static void main(String[] args) {
        int bound = 1_000_000_000;
        Random random = new Random();
        int number = random.nextInt(bound);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int option;
                do {
                    option = random.nextInt(bound);
                } while (option != number);
                winner = true;
                System.out.println("Winner " + option);
            }
        });
        thread.start();
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000_000; i++) {
                    if (winner) {
                        break;
                    }
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
        timer.start();
    }
}

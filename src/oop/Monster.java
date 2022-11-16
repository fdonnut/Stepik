package oop;

public class Monster {
    int eyes;
    int arms;
    int legs;

    Monster() {
        this(2);
    }

    Monster(int amount) {
        this(amount, amount, amount);
    }

    public Monster(int eyes, int arms, int legs) {
        this.eyes = eyes;
        this.arms = arms;
        this.legs = legs;
    }

    void voice() {
        voice(1);
    }

    void voice(int count) {
        voice(count, "Grrrrrrrr...");
    }

    void voice(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }
}

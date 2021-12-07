package Roll_the_Dice;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random numberDice = new Random();
        int roll = numberDice.nextInt(20) + 1;

        System.out.println("You rolled a: " + roll);
    }

}
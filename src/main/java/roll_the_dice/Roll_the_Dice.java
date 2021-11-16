package roll_the_dice;

import java.util.Random;

public class Roll_the_Dice {

    public static void main(String[] args) {

        Random numberDice = new Random();
        int roll = numberDice.nextInt(20) + 1;

        System.out.println("You rolled a: " + roll);
    }

}
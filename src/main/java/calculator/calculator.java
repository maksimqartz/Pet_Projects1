// Simple terminal-calculator
package calculator;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        //Scanning the Input and converting it to a variable
        Scanner userInput = new Scanner(System.in);


        // User manipulation
        System.out.println("This is the Basic Calculator v1.0");
        System.out.println("Please enter your first value");
        double firstValue = userInput.nextDouble();
        System.out.println("Please enter your second value");
        double secondValue = userInput.nextDouble();

        //Close Scanner
        userInput.close();

        //Calculation process
        double sum = firstValue + secondValue;
        double subtraction = firstValue - secondValue;
        double product = firstValue * secondValue;
        double quotient = firstValue / secondValue;
        double remainder = firstValue % secondValue;

        //Print out the results
        System.out.println("Here is your results:");
        System.out.printf("Sum: %f + %f = %f \n", firstValue, secondValue, sum);
        System.out.printf("Subtraction: %f - %f = %f \n", firstValue, secondValue, subtraction);
        System.out.printf("Product: %f * %f = %f \n", firstValue, secondValue, product);
        System.out.printf("Quotient: %f / %f = %f \n", firstValue, secondValue, quotient);
        System.out.printf("Remainder: %f // %f = %f", firstValue, secondValue, remainder);

    }

}

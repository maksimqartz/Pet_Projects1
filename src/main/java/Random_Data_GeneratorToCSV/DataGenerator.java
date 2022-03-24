package Random_Data_GeneratorToCSV;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class DataGenerator {

    protected static String getRandomEmail() {
        String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder email = new StringBuilder();
        Random rnd = new Random();
        while (email.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * CHARS.length());
            email.append(CHARS.charAt(index));
        }
        return email.toString();
    }

    private static final int COLS = 2;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        // Scanning the Input and converting it to a variable
        Scanner userInput = new Scanner(System.in);

        System.out.println("This is the Basic Data Generator v1.0");
        System.out.println("How many pairs of phone numbers and email do you want to receive?");
        double customRows = userInput.nextDouble();

        // Close Scanner
        userInput.close();


        File outputFile = new File("C:/Users/banif/Desktop/QA/Output.csv");
        try {
            PrintWriter writer = new PrintWriter(outputFile);
            for (int i = 0; i < customRows; i++) {
                for (int j = 0; j < COLS - 1; j++) {
                    writer.printf(getRandomEmail() + "@gmail.com ,");
                }
                writer.printf("7990%d%n", RANDOM.nextInt(9999999 - 1000000) + 1000000);
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

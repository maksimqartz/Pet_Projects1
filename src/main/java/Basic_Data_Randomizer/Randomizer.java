package Basic_Data_Randomizer;

import java.util.Random;

public class Randomizer {

    public static void main(String[] args) {
        Random random = new Random();

        String fullName = "fullName" + random.nextInt();
        String firstName = "firstName" + random.nextInt();
        String lastName = "lastName" + random.nextInt();

        String streetAddress = "address" + random.nextInt();
        String emailAddress = "email" + random.nextInt();

        long phoneNumber = (long) (Math.random() * 100000 + 3333000000L);

        System.out.println("The Full Name is: " + fullName);
        System.out.println("The First Name is: " + firstName);
        System.out.println("The Last Name is: " + lastName);

        System.out.println("\nThe Address is: " + streetAddress);
        System.out.println("The Email is: " + emailAddress);

        System.out.println("\nThe Phone Number is: " + phoneNumber);
    }
}

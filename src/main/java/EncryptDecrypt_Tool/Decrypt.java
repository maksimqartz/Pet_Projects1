package EncryptDecrypt_Tool;

import java.util.Scanner;

public class Decrypt {

    public static void main(String[] args) {

        // Запускаем сканнер, метод userInput будет вызывать функционал сканнера ввода
        Scanner userInput = new Scanner(System.in);
        System.out.println("This is the Decryption Tool v1.0");
        System.out.println("\nPlease enter encrypted message:");
        String textToDecrypt = userInput.nextLine();

        System.out.println("\nPlease enter your decryption key:");
        int decryptionKey = userInput.nextInt();

        // Close Scanner
        userInput.close();

        System.out.print("\nYour result for:\n" + textToDecrypt + "\n");
        // Конвертируем перменную с текстом в побуквенную запись (множество символов)
        char[] chars = textToDecrypt.toCharArray();

        // Чар - уникод, прибавляем к каждому значению число ключа, "сдвигая" алфавит
        for (char textDecrypt : chars) {
            textDecrypt -= decryptionKey;
            System.out.print(textDecrypt);
        }
    }
}

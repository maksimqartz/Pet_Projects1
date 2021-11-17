package EncryptDecrypt_Tool;

import java.util.Random;
import java.util.Scanner;

public class Encrypt {

    public static void main(String[] args) {

        // Пользовательский ввод: сообщение + ключ для шифрования
        Scanner userInput = new Scanner(System.in);
        System.out.println("This is the Encryption Tool v1.0");
        System.out.println("\nPlease enter your secret message:");
        String textToEncrypt = userInput.nextLine();

        System.out.println("\nPlease enter your key-number (any number from 1 to 50):");
        int userKey = userInput.nextInt();

        // Цикл while предаст нашему вводу границы, и не позволит сломать шифратор слишком маленьким-большим числом
        while (userKey > 50 | userKey < 1) {
            System.out.print("\nThe key is not valid. Please try to enter the number again:");
            userKey = userInput.nextInt();
        }

        // Close Scanner
        userInput.close();

        System.out.print("\nYour result for:\n" + textToEncrypt + "\n");

        // Создаем рандомную цифру для шифровки
        Random random = new Random();
        int randomKey = random.nextInt(50);

        int key = randomKey + userKey;

        // Конвертируем перменную с текстом в побуквенную запись (множество символов)
        char[] chars = textToEncrypt.toCharArray();

        // Чар - уникод, прибавляем к каждому значению число ключа, "сдвигая" алфавит
        char textDecrypt = 0;
        for (char inner_textDecrypt : chars) {
            textDecrypt = inner_textDecrypt;
            inner_textDecrypt += key;
            System.out.print(inner_textDecrypt);
        }

        System.out.print("\n\n====" + key + "====" + "\nThis is your personal decryption key. Please remember this number and keep it confidential. Give this number only to trusted persons who need to decrypt this message.");

    }
}
//TODO: Нужно сделать так, что бы из форич сразу приходил стринг с зашифр сообщением. Для этого нужно как-то объеденить отдельные символы и передать их в textDecrypt
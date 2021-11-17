package Basic_Login_System;

public class Main {
    public static void main(String[] args) {

        // Создаем экземпляр по действию с паролем и логином. Create the instance
        SecretPasswords secretPasswords = new SecretPasswords();

        /*
        Создаем экземпляр страницы для входа
        Далее в скобках мы задаем команду для получения хеш-карты ЛогинПароль,
        вставим в скобки = зададим аргумент, который отправится на страницу входа
         */
        LoginPage loginPage = new LoginPage(secretPasswords.getLoginPasswords());

    }
}

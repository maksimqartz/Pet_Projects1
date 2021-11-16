package Basic_Login_System;

import java.util.HashMap;

public class SecretPasswords {

    //Создаем хеш-карты, которые позволят хранить пары логинь-пароль
    HashMap<String, String> loginPasswords = new HashMap<>();

    //Конструктор для данных по входу
    SecretPasswords() {

        //Данные
        loginPasswords.put("Moscow_User", "qwerty");
        loginPasswords.put("London_User", "tea1234");
        loginPasswords.put("UAE_User", "Dubai");
        loginPasswords.put("Oleg", "Oleg");
    }

    //Метод для передачи в другие классы. При обращении к этому защищенному методу, он вернет хеш-карту
    protected HashMap getLoginPasswords() {
        return loginPasswords;
    }
}

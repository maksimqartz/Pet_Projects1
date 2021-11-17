package Basic_Login_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

// Добавляем в класс интерфейс прослушивания действий
public class LoginPage implements ActionListener {

    // Нам нужен UI
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userLoginField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userLoginLabel = new JLabel("Your Login:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel messageLabel = new JLabel();
    // Копируем и оставляем здесь хеш-карты с ЛогинПаролями
    HashMap<String, String> loginPass = new HashMap<>();

    // Создаем конструктор для страницы входа
    LoginPage(HashMap<String, String> loginPasswordsOriginal) {

        // Совмещение копий и оригинала хеш-карты
        loginPass = loginPasswordsOriginal;

        // Инфа у полей
        userLoginLabel.setBounds(60, 155, 75, 25);
        userPasswordLabel.setBounds(60, 205, 75, 25);

        // Оповещение
        messageLabel.setBounds(130, 310, 250, 35);
        messageLabel.setFont(new Font(null, Font.BOLD, 25));

        // Поля ввода
        userLoginField.setBounds(140, 155, 200, 25);
        userPasswordField.setBounds(140, 205, 200, 25);

        // Кнопки
        loginButton.setBounds(130, 270, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(240, 270, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        // Добавление элементов в окно
        frame.add(userLoginLabel);
        frame.add(userPasswordLabel);
        frame.add(userLoginField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(messageLabel);

        // Задаем окошко для нашего ПО (видимый, отключается при закрытии...)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 450);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    // Метод actionPerformed позволяет задать активности для наших кнопок
    @Override
    public void actionPerformed(ActionEvent e) {

        // Теперь кнопка ресет очищает поля ввода
        if (e.getSource() == resetButton) {
            userLoginField.setText("");
            userPasswordField.setText("");
        }

        if (e.getSource() == loginButton) {

            String userLogin = userLoginField.getText();
            String userPassword = String.valueOf(userPasswordField.getPassword());

            if (loginPass.containsKey(userLogin)) {
                if (loginPass.get(userLogin).equals(userPassword)) {
                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("Login Successful!");
                    // Убираем окно логина
                    frame.dispose();
                    // Отправляем в окно приветсвия, передавая имя пользователя
                    WelcomePage welcomePage = new WelcomePage(userLogin);
                } else {
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Wrong Password!");
                }
            } else {
                messageLabel.setForeground(Color.ORANGE);
                messageLabel.setText("Login not found");
            }
        }
    }
}

package Basic_Login_System;

import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Welcome!");

    //Получаем имя, вставляем в приветсвие
    WelcomePage(String userLogin) {

        welcomeLabel.setBounds(80, 200, 225, 35);
        welcomeLabel.setFont(new Font(null, Font.ITALIC, 28));
        welcomeLabel.setText("Welcome " + userLogin);

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 450);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

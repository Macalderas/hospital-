import metodos.Login;

import javax.swing.*;

public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        Login loginFrame = new Login();

        loginFrame.setVisible(true);
    });
}
package metodos;

import javax.swing.*;
import java.awt.*;

public class Login  extends JFrame {
    public Login() {
        setTitle("MCalderas");
        setSize(1800, 1000);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the application closes properly

        setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel(new GridLayout(1, 2));
        mainPanel.setBackground(Color.RED);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.red);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());
        panel2.setBackground(Color.white);

        GridBagConstraints fgl = new GridBagConstraints();
        fgl.anchor = GridBagConstraints.CENTER;

        fgl.gridx = 0;
        fgl.gridy = 0;

        JLabel emailLabel = new JLabel("Correo:");
        panel2.add(emailLabel, fgl);

        fgl.gridx = 1;
        JTextField emailField = new JTextField(20);
        panel2.add(emailField, fgl);

        fgl.gridx = 0;
        fgl.gridy = 1;
        JLabel passwordLabel = new JLabel("Contraseña:");
        panel2.add(passwordLabel, fgl);

        fgl.gridx = 1;
        JPasswordField passwordField = new JPasswordField(20);
        panel2.add(passwordField, fgl);

        fgl.gridx = 0;
        fgl.gridy = 2;
        fgl.gridwidth = 2;
        JButton loginButton = new JButton("Login");
        panel2.add(loginButton, fgl);

        mainPanel.add(panel1);
        mainPanel.add(panel2);

        add(mainPanel, BorderLayout.CENTER);
    }


}

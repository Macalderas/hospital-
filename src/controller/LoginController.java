package controller;
import view.LoginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {
    private LoginView loginView;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        // Listener para el botón de login (ejemplo)
        this.loginView.addLoginListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlDelLogin(); // Llama a tu método cuando ocurra un evento
            }
        });
    }

    private void controlDelLogin() {
        System.out.println("hola login");
    }
}

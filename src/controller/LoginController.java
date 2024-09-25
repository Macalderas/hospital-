package controller;

import view.LoginView;
import backEnde.UsuarioService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class LoginController {
    private LoginView loginView;
    private UsuarioService usuarioService;

    public LoginController(LoginView loginView, UsuarioService usuarioService) {
        this.loginView = loginView;
        this.usuarioService = usuarioService;

        this.loginView.addLoginListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlDelLogin();
            }
        });
    }

    private void controlDelLogin() {
        String usuario = loginView.getEmail();
        String contraseña = loginView.getPassword();

        Map<String, String> resultado = usuarioService.validarDatos(usuario, contraseña);

        for (Map.Entry<String, String> entry : resultado.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
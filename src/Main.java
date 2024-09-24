import view.LoginView;
import controller.LoginController;
import backEnde.UsuarioService;

public class Main {
    public static void main(String[] args) {
        UsuarioService usuarioService = new UsuarioService();
        LoginView loginView = new LoginView();

        new LoginController(loginView, usuarioService);
    }
}

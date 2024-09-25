import view.LoginView;
import controller.LoginController;
import backEnde.UsuarioService;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de UsuarioService y LoginView
        UsuarioService usuarioService = new UsuarioService();
        LoginView loginView = new LoginView();

        new LoginController(loginView, usuarioService);
    }
}

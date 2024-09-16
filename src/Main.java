import controller.LoginController;
import view.LoginView;

public class Main {
    public static void main(String[] args) {
        LoginView loginFrame = new LoginView(); // Instancia de LoginView
        LoginController controlLogin = new LoginController(loginFrame); // Pasar loginFrame
    }
}
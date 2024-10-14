package view;
import javax.swing.*;
import java.awt.*;z
import java.util.HashMap;

public class doctorView extends JFrame {

    private int[] pantalla = {1300, 800};

    public doctorView(HashMap<String, String> datosDoctor) {
        setTitle("Perfil del Doctor");
        setSize(pantalla[0], pantalla[1]);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(Color.DARK_GRAY);
        headerPanel.setLayout(new BorderLayout());

        JLabel hospitalLabel = new JLabel("Hospital Santa Catalina");
        hospitalLabel.setForeground(Color.WHITE);
        hospitalLabel.setFont(new Font("Arial", Font.BOLD, 16));
        headerPanel.add(hospitalLabel, BorderLayout.WEST);

        JPanel userPanel = new JPanel(new GridBagLayout());
        userPanel.setBackground(Color.DARK_GRAY);
Estimado Profesor Jossue Fuentes,

Espero que se encuentre bien. Le escribo para solicitar, de manera atenta, que pueda revisar los ejercicios y pruebas que he presentado en la plataforma. He notado que algunos de ellos tienen un puntaje bajo, y me gustaría saber si existe la posibilidad de corregirlos o recibir alguna retroalimentación sobre los errores cometidos.

Agradezco de antemano su atención y quedo a la espera de su respuesta.
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 10, 0, 10);

        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(Color.YELLOW);  
        logoPanel.setPreferredSize(new Dimension(40, 40));
        userPanel.add(logoPanel, gbc);

        gbc.gridx = 1;
        JLabel nameLabel = new JLabel(datosDoctor.get("nombre"));
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        userPanel.add(nameLabel, gbc);

        gbc.gridy = 1;
        JLabel titleLabel = new JLabel(datosDoctor.get("titulo"));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        userPanel.add(titleLabel, gbc);

        headerPanel.add(userPanel, BorderLayout.EAST);

        add(headerPanel, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        HashMap<String, String> datosDoctor = new HashMap<>();
        datosDoctor.put("nombre", "Doctor Simi");
        datosDoctor.put("titulo", "Doctor General");

        SwingUtilities.invokeLater(() -> {
            doctorView frame = new doctorView(datosDoctor);
            frame.setVisible(true);
        });
    }
}

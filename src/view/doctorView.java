package view;
import javax.swing.*;
import java.awt.*;

public class doctorView  extends JFrame{


    // Atributo pantalla que contiene las dimensiones de la ventana
    private int[] pantalla = {1300, 800};

    public doctorView () {
        // Configura las dimensiones del JFrame usando el array pantalla
        setTitle("Perfil del Doctor");
        setSize(pantalla[0], pantalla[1]);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Crear el panel headerPanel
        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(Color.DARK_GRAY);
        headerPanel.setLayout(new BorderLayout());

        // Crear JLabel para el nombre del hospital y colocarlo en el lado izquierdo
        JLabel hospitalLabel = new JLabel("Hospital Santa Catalina");
        hospitalLabel.setForeground(Color.WHITE);
        hospitalLabel.setFont(new Font("Arial", Font.BOLD, 16));
        headerPanel.add(hospitalLabel, BorderLayout.WEST);

        // Crear el panel userPanel con GridBagLayout
        JPanel userPanel = new JPanel(new GridBagLayout());
        userPanel.setBackground(Color.DARK_GRAY);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 10, 0, 10);

        // Panel para el logo (puedes insertar un componente gráfico o imagen aquí)
        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(Color.YELLOW);  // Representación simple de un logo con color
        logoPanel.setPreferredSize(new Dimension(40, 40));
        userPanel.add(logoPanel, gbc);

        // Etiqueta para el nombre del doctor
        gbc.gridx = 1;
        JLabel nameLabel = new JLabel("Mynor Calderas");
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        userPanel.add(nameLabel, gbc);

        // Etiqueta para la especialidad del doctor
        gbc.gridy = 1;
        JLabel titleLabel = new JLabel("Doctor General");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        userPanel.add(titleLabel, gbc);

        // Añadir el userPanel al lado derecho del headerPanel
        headerPanel.add(userPanel, BorderLayout.EAST);

        // Añadir el panel superior a la ventana
        add(headerPanel, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        // Crear y mostrar la ventana
        SwingUtilities.invokeLater(() -> {
            doctorView frame = new doctorView();
            frame.setVisible(true);
        });
    }
}
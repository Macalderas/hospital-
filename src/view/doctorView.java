package view;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class doctorView extends JFrame {

    // Atributo pantalla que contiene las dimensiones de la ventana
    private int[] pantalla = {1300, 800};

    public doctorView(HashMap<String, String> datosDoctor) {
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
        JLabel nameLabel = new JLabel(datosDoctor.get("nombre")); // Usar el valor del HashMap
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        userPanel.add(nameLabel, gbc);

        // Etiqueta para la especialidad del doctor
        gbc.gridy = 1;
        JLabel titleLabel = new JLabel(datosDoctor.get("titulo")); // Usar el valor del HashMap
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        userPanel.add(titleLabel, gbc);

        // Añadir el userPanel al lado derecho del headerPanel
        headerPanel.add(userPanel, BorderLayout.EAST);

        // Añadir el panel superior a la ventana
        add(headerPanel, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        // Crear un HashMap con los datos del doctor
        HashMap<String, String> menu = new HashMap<>();
        datosDoctor.put("nombre", "Doctor Simi");
        datosDoctor.put("titulo", "Doctor General");

        // Crear y mostrar la ventana
        SwingUtilities.invokeLater(() -> {
            doctorView frame = new doctorView(menu);
            frame.setVisible(true);
        });
    }
}

  private JPanel componentMenuLateral (){
    JPanel menuPanel = new JPanel();
    menu.setPreferredSize(new Dimension( 250,pantalla[1]));
    menu.setBackground(Color.darkGray);

    JPanel menu = new JPanel();
    menu.setLayout(new GridLayout(5,1));
    menu.setBackground(Color.green);

GridBagConstraints gbc = new GridBagConstraints();
gbc.fill = GridBagConstraints.HORIZONTAL;
gbc.gridx = 0;

      menu.add(op("opcion1"),gbc);
      menu.add(op("opcion2"),gbc);
      menu.add(op("opcion3"),gbc);
      menu.add(op("opcion4"),gbc);
      menu.add(op("opcion5"),gbc);

      return  menuPanel;
        }

        private JButton op (String texto) {
       JButton op  = new JButton(texto);

       op.addActionListener(e -> {
           System.out.println(texto);
       });
           return op;


        }
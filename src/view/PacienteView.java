package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PacienteView {
    private ArrayList<Paciente> pacientes;

    public PacienteView(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public JPanel panelPaciente() {
        JPanel panel = new JPanel(); // Crea un nuevo JPanel
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Configura el layout

        JLabel titleLabel = new JLabel("Listado de pacientes.");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(titleLabel); // Agrega el título al panel

        String[] campos = {"NOMBRE", "FECHA_NACIMIENTO", "HORARIO_CITA", "VISITA"};

        for (String campo : campos) {
            JLabel campoLabel = new JLabel(campo);
            campoLabel.setFont(new Font("Arial", Font.BOLD, 14));
            panel.add(campoLabel);
        }

        for (Paciente paciente : pacientes) {
            JLabel nombreLabel = new JLabel(paciente.getNombre());
            JLabel fechaNacimientoLabel = new JLabel(paciente.getFechaNacimiento());
            JLabel horarioCitaLabel = new JLabel(paciente.getHorarioCita());
            JLabel visitaLabel = new JLabel(paciente.getVisita());

            JPanel filaPanel = new JPanel();
            filaPanel.setLayout(new FlowLayout());

            filaPanel.add(nombreLabel);
            filaPanel.add(fechaNacimientoLabel);
            filaPanel.add(horarioCitaLabel);
            filaPanel.add(visitaLabel);

            panel.add(filaPanel);
            panel.add(Box.createVerticalStrut(5));
        }

        return panel;
    }
}

  class Paciente {
    private String nombre;
    private String fechaNacimiento;
    private String horarioCita;
    private String visita;

    public Paciente(String nombre, String fechaNacimiento, String horarioCita, String visita) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.horarioCita = horarioCita;
        this.visita = visita;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getHorarioCita() {
        return horarioCita;
    }

    public String getVisita() {
        return visita;
    }
}

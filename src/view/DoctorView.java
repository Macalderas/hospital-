package view;
import Salas.DataSalas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoctorView {
    private JButton botonSalas;
    private JPanel tablaPacientes;
    private JPanel panelSalas;

    public DoctorView() {
        botonSalas = new JButton("Salas");
        tablaPacientes = new JPanel(); // Simulando la tabla de pacientes
        panelSalas = new SalasView(new DataSalas()).crearGrid(); // Crea el panel de salas

        botonSalas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tablaPacientes.setVisible(false); // Oculta la tabla de pacientes
                panelSalas.setVisible(true); // Muestra el panel de salas
            }
        });

        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.add(botonSalas, BorderLayout.NORTH);
        frame.add(tablaPacientes, BorderLayout.CENTER);
        frame.add(panelSalas, BorderLayout.SOUTH);

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}



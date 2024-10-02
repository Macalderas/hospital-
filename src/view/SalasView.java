package view;
import Salas.DataSalas;
import Salas.Sala;

import javax.swing.*;
import java.util.ArrayList;

public class SalasView {

    private ArrayList<String> nombres;
    private ArrayList<String> estados;

    public SalasView(DataSalas dataSalas) {
        nombres = new ArrayList<>();
        estados = new ArrayList<>();
        for (Sala sala : dataSalas.getSalas()) {
            nombres.add(sala.getNombre());
            estados.add(sala.getEstado());
        }
    }

    public ArrayList<String> getNombres() {
        return nombres;
    }

    public ArrayList<String> getEstados() {
        return estados;
    }

    public JPanel crearGrid() {
    }
}




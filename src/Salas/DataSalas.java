package Salas;
import java.util.ArrayList;
public class DataSalas {
    private ArrayList<Sala> salas;

    public DataSalas() {
        salas = new ArrayList<>();
        salas.add(new Sala("Sala 1", "En uso"));
        salas.add(new Sala("Sala 2", "Fuera de servicio"));
        salas.add(new Sala("Sala 3", "Disponible"));
        // Añadir más salas hasta completar 12
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }
}

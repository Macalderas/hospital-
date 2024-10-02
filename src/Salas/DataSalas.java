package Salas;
import java.util.ArrayList;
public class DataSalas {
    private ArrayList<Sala> salas;

    public DataSalas() {
        salas = new ArrayList<>();
        salas.add(new Sala("Sala 1", "En uso"));
        salas.add(new Sala("Sala 2", "Fuera de servicio"));
        salas.add(new Sala("Sala 3", "Disponible"));
        salas.add(new Sala("Sala 4", "En uso"));
        salas.add(new Sala("Sala 5", "Fuera de servicio"));
        salas.add(new Sala("Sala 6", "Disponible"));
        salas.add(new Sala("Sala 7", "En uso"));
        salas.add(new Sala("Sala 8", "Fuera de servicio"));
        salas.add(new Sala("Sala 9", "Disponible"));
        salas.add(new Sala("Sala 10", "En uso"));
        salas.add(new Sala("Sala 11", "Fuera de servicio"));
        salas.add(new Sala("Sala 12", "Disponible"));
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }
}

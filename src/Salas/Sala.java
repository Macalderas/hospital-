package Salas;

public class Sala {
    private String nombre;
    private String estado;

    public Sala(String nombre, String estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }
}


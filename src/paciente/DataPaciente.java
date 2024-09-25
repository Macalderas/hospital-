package paciente;

import java.util.ArrayList;
import java.util.List;

public class DataPaciente {

    // Lista de pacientes
    private List<Paciente> pacientes;


    // Constructor que inicializa la lista con 20 pacientes
    public DataPaciente() {
        pacientes = new ArrayList<>();
        inicializarPacientes();
    }

    // Método que inicializa los 20 pacientes
    private void inicializarPacientes() {
        pacientes.add(new Paciente("Carlos Pérez", "carlos.perez@mail.com", "555-1234", "Av. Libertad 45",
                "1985-03-12", "10:30", "Consulta General", 5, "Dr. Juan García"));
        pacientes.add(new Paciente("María López", "maria.lopez@mail.com", "555-5678", "Calle Primavera 23",
                "1990-06-25", "11:00", "Chequeo de Rutina", 3, "Dr. Ana Rodríguez"));
        pacientes.add(new Paciente("Luis Gómez", "luis.gomez@mail.com", "555-3456", "Plaza Sol 12",
                "1975-11-04", "09:00", "Control de Presión Arterial", 4, "Dr. Juan García"));
        pacientes.add(new Paciente("Ana Torres", "ana.torres@mail.com", "555-7890", "Calle Luna 78",
                "1989-07-14", "14:00", "Dolor de Cabeza", 2, "Dr. Carmen Ruiz"));
        pacientes.add(new Paciente("José Martínez", "jose.martinez@mail.com", "555-6543", "Av. Pinos 56",
                "1967-02-18", "08:30", "Consulta General", 6, "Dr. Juan García"));
        pacientes.add(new Paciente("Lucía Fernández", "lucia.fernandez@mail.com", "555-0987", "Calle Olivo 34",
                "1992-09-10", "15:30", "Chequeo de Rutina", 1, "Dr. Ana Rodríguez"));
        pacientes.add(new Paciente("Pedro Sánchez", "pedro.sanchez@mail.com", "555-3210", "Av. Manzana 89",
                "1980-12-05", "13:30", "Control de Presión Arterial", 7, "Dr. Juan García"));
        pacientes.add(new Paciente("Elena Gutiérrez", "elena.gutierrez@mail.com", "555-4321", "Plaza Robles 56",
                "1978-08-22", "16:00", "Dolor de Cabeza", 2, "Dr. Carmen Ruiz"));
        pacientes.add(new Paciente("Andrés Ramírez", "andres.ramirez@mail.com", "555-6789", "Calle Sol 23",
                "1995-03-19", "10:00", "Consulta General", 3, "Dr. Juan García"));
        pacientes.add(new Paciente("Sofía Díaz", "sofia.diaz@mail.com", "555-8901", "Av. Luna 88",
                "2001-01-30", "11:30", "Chequeo de Rutina", 1, "Dr. Ana Rodríguez"));
        pacientes.add(new Paciente("Miguel Castillo", "miguel.castillo@mail.com", "555-5670", "Calle Solano 42",
                "1988-04-17", "09:30", "Control de Presión Arterial", 5, "Dr. Juan García"));
        pacientes.add(new Paciente("Clara Vega", "clara.vega@mail.com", "555-7654", "Av. Sauces 24",
                "1993-11-08", "14:30", "Dolor de Cabeza", 3, "Dr. Carmen Ruiz"));
        pacientes.add(new Paciente("Ramiro Rojas", "ramiro.rojas@mail.com", "555-2345", "Calle Robles 35",
                "1979-09-25", "16:30", "Consulta General", 4, "Dr. Juan García"));
        pacientes.add(new Paciente("Paola Morales", "paola.morales@mail.com", "555-8902", "Av. Nogal 66",
                "1997-05-15", "08:00", "Chequeo de Rutina", 1, "Dr. Ana Rodríguez"));
        pacientes.add(new Paciente("Daniel Ortiz", "daniel.ortiz@mail.com", "555-1235", "Calle Pinos 9",
                "1986-12-19", "12:00", "Control de Presión Arterial", 6, "Dr. Juan García"));
        pacientes.add(new Paciente("Carolina Suárez", "carolina.suarez@mail.com", "555-8765", "Plaza Cedro 77",
                "1991-07-21", "15:00", "Dolor de Cabeza", 2, "Dr. Carmen Ruiz"));
        pacientes.add(new Paciente("Héctor Valdez", "hector.valdez@mail.com", "555-4322", "Av. Cipreses 18",
                "1983-06-03", "11:15", "Consulta General", 3, "Dr. Juan García"));
        pacientes.add(new Paciente("Laura Paredes", "laura.paredes@mail.com", "555-6780", "Calle Ciprés 67",
                "1970-10-11", "12:45", "Chequeo de Rutina", 4, "Dr. Ana Rodríguez"));
        pacientes.add(new Paciente("Gabriel Navarro", "gabriel.navarro@mail.com", "555-2346", "Av. Los Cedros 43",
                "1994-02-27", "13:15", "Control de Presión Arterial", 3, "Dr. Juan García"));
        pacientes.add(new Paciente("Valentina Estrada", "valentina.estrada@mail.com", "555-7891", "Calle Pino 24",
                "1987-09-14", "10:45", "Dolor de Cabeza", 5, "Dr. Carmen Ruiz"));
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }
}
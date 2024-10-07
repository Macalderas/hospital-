package Farmacia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataFarmacia {

    private List<Medicamento> medicamentos;

    public DataFarmacia() {
        medicamentos = new ArrayList<>();
        cargarDatos();
        // Invertimos la lista después de haber cargado los medicamentos
        Collections.reverse(medicamentos);
    }

    // Método para cargar datos de medicamentos
    private void cargarDatos() {
        medicamentos.add(new Medicamento("Paracetamol", "Tableta", "500mg", "Paracetamol",
                LocalDate.of(2025, 5, 10), "Lote123", 4.99, "Alivio de dolor leve y fiebre", "Hipersensibilidad"));
        medicamentos.add(new Medicamento("Ibuprofeno", "Cápsula", "400mg", "Ibuprofeno",
                LocalDate.of(2024, 3, 15), "Lote456", 7.50, "Antiinflamatorio, analgésico", "Úlcera gástrica, embarazo"));
        medicamentos.add(new Medicamento("Amoxicilina", "Suspensión", "250mg/5ml", "Amoxicilina",
                LocalDate.of(2023, 12, 1), "Lote789", 12.99, "Infecciones bacterianas", "Alergia a penicilinas"));
        medicamentos.add(new Medicamento("Loratadina", "Tableta", "10mg", "Loratadina",
                LocalDate.of(2026, 2, 20), "Lote101", 3.75, "Antihistamínico para alergias", "Insuficiencia hepática"));
        medicamentos.add(new Medicamento("Omeprazol", "Cápsula", "20mg", "Omeprazol",
                LocalDate.of(2025, 6, 30), "Lote202", 8.20, "Tratamiento de úlceras", "Hipersensibilidad a los benzimidazoles"));
        medicamentos.add(new Medicamento("Metformina", "Tableta", "850mg", "Metformina",
                LocalDate.of(2025, 7, 10), "Lote303", 5.50, "Diabetes tipo 2", "Insuficiencia renal severa"));
        medicamentos.add(new Medicamento("Salbutamol", "Inhalador", "100mcg/dosis", "Salbutamol",
                LocalDate.of(2024, 10, 25), "Lote404", 15.75, "Asma, broncoespasmos", "Hipertensión no controlada"));
        medicamentos.add(new Medicamento("Simvastatina", "Tableta", "40mg", "Simvastatina",
                LocalDate.of(2026, 8, 5), "Lote505", 6.50, "Reducción de colesterol", "Enfermedad hepática activa"));
        medicamentos.add(new Medicamento("Acetaminofén", "Jarabe", "160mg/5ml", "Acetaminofén",
                LocalDate.of(2023, 11, 12), "Lote606", 4.25, "Fiebre y dolor en niños", "Insuficiencia hepática"));
        medicamentos.add(new Medicamento("Clonazepam", "Tableta", "2mg", "Clonazepam",
                LocalDate.of(2025, 9, 18), "Lote707", 10.99, "Ansiedad, epilepsia", "Depresión respiratoria severa"));
        medicamentos.add(new Medicamento("Losartán", "Tableta", "50mg", "Losartán",
                LocalDate.of(2026, 3, 14), "Lote808", 7.99, "Hipertensión", "Embarazo"));
        medicamentos.add(new Medicamento("Levotiroxina", "Tableta", "100mcg", "Levotiroxina",
                LocalDate.of(2025, 4, 9), "Lote909", 3.50, "Hipotiroidismo", "Tirotoxicosis"));
        medicamentos.add(new Medicamento("Diclofenaco", "Gel", "1%", "Diclofenaco sódico",
                LocalDate.of(2023, 10, 1), "Lote010", 5.60, "Dolor muscular y articular", "Hipersensibilidad a AINEs"));
        medicamentos.add(new Medicamento("Enalapril", "Tableta", "10mg", "Enalapril",
                LocalDate.of(2024, 2, 28), "Lote111", 4.99, "Insuficiencia cardíaca, hipertensión", "Angioedema"));
        medicamentos.add(new Medicamento("Cefalexina", "Cápsula", "500mg", "Cefalexina",
                LocalDate.of(2025, 11, 30), "Lote121", 9.99, "Infecciones bacterianas", "Alergia a cefalosporinas"));
        medicamentos.add(new Medicamento("Ranitidina", "Tableta", "150mg", "Ranitidina",
                LocalDate.of(2023, 12, 15), "Lote222", 4.50, "Tratamiento de úlceras gástricas", "Insuficiencia renal"));
        medicamentos.add(new Medicamento("Furosemida", "Inyección", "20mg/2ml", "Furosemida",
                LocalDate.of(2024, 7, 22), "Lote333", 2.99, "Edema, insuficiencia cardíaca", "Anuria"));
        medicamentos.add(new Medicamento("Azitromicina", "Suspensión", "200mg/5ml", "Azitromicina",
                LocalDate.of(2025, 3, 18), "Lote444", 14.50, "Infecciones bacterianas", "Alergia a macrólidos"));
        medicamentos.add(new Medicamento("Fluconazol", "Cápsula", "150mg", "Fluconazol",
                LocalDate.of(2024, 5, 17), "Lote555", 12.99, "Infecciones por hongos", "Insuficiencia hepática severa"));
        medicamentos.add(new Medicamento("Insulina Glargina", "Inyección", "100 UI/ml", "Insulina Glargina",
                LocalDate.of(2025, 1, 20), "Lote666", 50.00, "Diabetes mellitus", "Hipoglucemia recurrente"));
        medicamentos.add(new Medicamento("Atenolol", "Tableta", "50mg", "Atenolol",
                LocalDate.of(2024, 9, 1), "Lote777", 6.50, "Hipertensión, angina", "Bradicardia severa"));
        medicamentos.add(new Medicamento("Morfina", "Inyección", "10mg/ml", "Morfina",
                LocalDate.of(2023, 12, 22), "Lote888", 18.99, "Dolor severo", "Depresión respiratoria"));
        medicamentos.add(new Medicamento("Claritromicina", "Cápsula", "500mg", "Claritromicina",
                LocalDate.of(2025, 11, 1), "Lote999", 19.99, "Infecciones bacterianas", "Hipersensibilidad a macrólidos"));
        medicamentos.add(new Medicamento("Dexametasona", "Tableta", "4mg", "Dexametasona",
                LocalDate.of(2024, 6, 12), "Lote011", 5.99, "Inflamación, alergias", "Infecciones fúngicas sistémicas"));
        medicamentos.add(new Medicamento("Hidroxicloroquina", "Tableta", "200mg", "Hidroxicloroquina",
                LocalDate.of(2026, 4, 15), "Lote222", 8.99, "Lupus, artritis reumatoide", "Retinopatía preexistente"));
        medicamentos.add(new Medicamento("Naproxeno", "Tableta", "500mg", "Naproxeno",
                LocalDate.of(2025, 7, 19), "Lote333", 7.50, "Dolor e inflamación", "Úlcera péptica activa"));
        medicamentos.add(new Medicamento("Warfarina", "Tableta", "5mg", "Warfarina",
                LocalDate.of(2026, 1, 25), "Lote444", 9.99, "Anticoagulante", "Sangrado activo"));
        medicamentos.add(new Medicamento("Clopidogrel", "Tableta", "75mg", "Clopidogrel",
                LocalDate.of(2025, 10, 30), "Lote555", 10.50, "Prevención de trombosis", "Hemorragia activa"));
        medicamentos.add(new Medicamento("Eritromicina", "Tableta", "500mg", "Eritromicina",
                LocalDate.of(2023, 12, 29), "Lote666", 12.50, "Infecciones bacterianas", "Hipersensibilidad a macrólidos"));
        medicamentos.add(new Medicamento("Tamsulosina", "Cápsula", "0.4mg", "Tamsulosina",
                LocalDate.of(2024, 8, 21), "Lote777", 6.99, "Hiperplasia prostática benigna", "Hipotensión ortostática"));
        medicamentos.add(new Medicamento("Prednisona", "Tableta", "10mg", "Prednisona",
                LocalDate.of(2025, 5, 7), "Lote888", 4.20, "Inflamación, reacciones alérgicas", "Infecciones no controladas"));
        medicamentos.add(new Medicamento("Candesartán", "Tableta", "16mg", "Candesartán",
                LocalDate.of(2026, 7, 9), "Lote999", 8.75, "Hipertensión, insuficiencia cardíaca", "Embarazo"));
        medicamentos.add(new Medicamento("Esomeprazol", "Cápsula", "40mg", "Esomeprazol",
                LocalDate.of(2024, 3, 5), "Lote010", 9.25, "Reflujo gastroesofágico", "Hipersensibilidad a los inhibidores de la bomba de protones"));
        medicamentos.add(new Medicamento("Fenitoína", "Tableta", "100mg", "Fenitoína",
                LocalDate.of(2025, 11, 22), "Lote121", 12.80, "Epilepsia", "Bradicardia severa"));
        medicamentos.add(new Medicamento("Carbamazepina", "Tableta", "200mg", "Carbamazepina",
                LocalDate.of(2026, 6, 30), "Lote232", 7.60, "Trastornos convulsivos", "Hipersensibilidad a tricíclicos"));
        medicamentos.add(new Medicamento("Alprazolam", "Tableta", "1mg", "Alprazolam",
                LocalDate.of(2024, 4, 17), "Lote343", 5.25, "Ansiedad, trastornos de pánico", "Insuficiencia respiratoria severa"));
    }

    // Método para obtener la lista de medicamentos
    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }
}
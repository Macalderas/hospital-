package backEnde;

import java.util.HashMap;
import java.util.Map;

public class UsuarioService {

    private static final Map<String, UsuarioInfo> BASE_DE_DATOS = new HashMap<>();

    static {
        BASE_DE_DATOS.put("doctor1", new UsuarioInfo("contraseña123", "Cardiología"));
        BASE_DE_DATOS.put("doctor2", new UsuarioInfo("contraseña456", "Neurología"));
        BASE_DE_DATOS.put("doctor3", new UsuarioInfo("contraseña789", "Pediatría"));
        BASE_DE_DATOS.put("doctor4", new UsuarioInfo("contraseña101", "Oncología"));
        BASE_DE_DATOS.put("doctor5", new UsuarioInfo("contraseña102", "Ginecología"));
    }

    public Map<String, String> validarDatos(String usuario, String contraseña) {
        Map<String, String> resultado = new HashMap<>();

        if (BASE_DE_DATOS.containsKey(usuario)) {
            UsuarioInfo info = BASE_DE_DATOS.get(usuario);
            if (info.getContraseña().equals(contraseña)) {
                resultado.put("Usuario", usuario);
                resultado.put("Contraseña", contraseña);
                resultado.put("Especialidad", info.getEspecialidad());
            } else {
                resultado.put("Error", "Contraseña incorrecta");
            }
        } else {
            resultado.put("Error", "Usuario no encontrado");
        }

        return resultado;
    }

    private static class UsuarioInfo {
        private String contraseña;
        private String especialidad;

        public UsuarioInfo(String contraseña, String especialidad) {
            this.contraseña = contraseña;
            this.especialidad = especialidad;
        }

        public String getContraseña() {
            return contraseña;
        }

        public String getEspecialidad() {
            return especialidad;
        }
    }
}

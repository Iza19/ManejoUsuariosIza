package mx.uach.fing.manejousuarios.controlador;

import java.util.ArrayList;
import java.util.List;
import mx.uach.fing.manejousuarios.dao.UsuarioDao;
import mx.uach.fing.manejousuarios.datos.Usuario;

/**
 * Clase que se encarga de manejar el proceso de altas, bajas, cambios y 
 * consultas de los usuarios.
 * @author Anaíza Araiza García
 */
public class Usuarios {
    
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        return usuarios;
    }
    
    public static void main(String[] args) {
        if (args[0] != null && args[0].equals("console")) {
            List<Usuario> usuarios = new UsuarioDao().list();

            for (Usuario usuario : usuarios) {
                System.out.println("-->" + usuario);
            }
        }
    }
    
}

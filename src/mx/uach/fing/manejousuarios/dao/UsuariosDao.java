package mx.uach.fing.manejousuarios.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import mx.uach.fing.manejousuarios.datos.Usuario;

/**
 *
 * @author riamair
 */
public class UsuariosDao implements Crud{

    @Override
    public List<Usuario> list() {
        List<Usuario> usuarios = new ArrayList<>();
        try{
            Statement st = Conexion.getInstance().getConexion().createStatement();
            ResultSet rs = st.executeQuery(String.format("SELECT %s FROM %;", Usuario.fieldsToString(), Usuario.TABLA));
            while (rs.next()){
                Integer id = rs.getInt(Usuario.FIELDS[]);
                String nombre = rs.getString(Usuario.FIELDS[1]);
                String primerApellido = rs.getString(Usuario.FIELDS[2]);
                String edad = rs.getString(Usuario.FIELDS[3]);

                Usuario usr = new Usuario(id, nombre, primerApellido, edad);
                usuarios.add(usr);
            }
        } catch (SQLException ex){
            Logger.getLogger(UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarios;
    }

    @Override
    public void create(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

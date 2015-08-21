package mx.uach.fing.manejousuarios.datos;

import java.util.Arrays;
import java.util.List;
import mx.uach.fing.manejousuarios.dao.UsuariosDao;

/**
 * Clase que se encarga de manejar los usuarios del sistema
 * @author Anaíza Araiza García
 * @version 1.0
 */
public class Usuario {
    
    public static final String TABLA = "usuarios";
    public static final String[] FIELDS = {"id", "nombre", "primer_apellido", "edad"};
    private Integer id;
    private String nombre;
    private String primerApellido;
    private Integer edad;

    /**
     * Método que regresa el identificador único de cada usuario.
     * @throws NullPointerException cuando no exista el usuario en la base de 
     * datos.
     * @return the id (numero entero).
     */
    public Integer getId() throws NullPointerException{
        if (this.id == null){
            throw new NullPointerException(String.format(
                    "El usuario %s %s no existe.", this.nombre, 
                    this.primerApellido));
        }
        return id;
    }

    public Usuario(Integer id, String nombre, String primerApellido, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.edad = edad;
    }

    /**
     * @param id que se asignará al usuario al ser guardado en la base de datos.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the primerApellido
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * @param primerApellido the primerApellido to set
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * @return the edad
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    public String fieldsToString(){
        String fieldsStr = "";
        List<String> fieldsToConvert = Arrays.asList(FIELDS);
        for (String field : fieldsToConvert) {
            fieldsStr = String.format("%s, %s", fieldsStr, field);
        }
        return fieldsStr;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", this.id, this.nombre, this.primerApellido, this.edad);
    }
    
}

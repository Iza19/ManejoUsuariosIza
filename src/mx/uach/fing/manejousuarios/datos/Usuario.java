package mx.uach.fing.manejousuarios.datos;

/**
 * Clase que se encarga de manejar los usuarios del sistema
 * @author Anaíza Araiza García
 * @version 1.0
 */
public class Usuario {
    
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
    
    
    
}

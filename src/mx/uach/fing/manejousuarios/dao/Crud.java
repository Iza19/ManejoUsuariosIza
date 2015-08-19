/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.uach.fing.manejousuarios.dao;

import java.util.List;
import mx.uach.fing.manejousuarios.datos.Usuario;

/**
 *
 * @author riamair
 */
public interface Crud {
    
    public List<Usuario> list();
    
    public void create(Usuario usuario);
    
    public void actualizar(Usuario usuario);
    
    public void eliminar(Usuario usuario);
    
}

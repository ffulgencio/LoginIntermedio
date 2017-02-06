package javaapplication1;

import java.util.Collection;
import java.util.Iterator;
import java.util.*;


/*
 * Clase DataSource
 * Modelo para nuestra fuente de datos
 * En este ejemplo se creo una coleccion para simular
 * registros de una tabla.
 * En el constructor se crean 10 usuarios automaticament.
 * Se pueden agregar mas durante la ejecucion.
 */

/**
 *
 * @author ffulgencio
 */
public class DataSource {
    
    // Atributo que guarda la lista de usuarios
    Collection Usuarios;
    
    // Atributo que indexará la lista de usuarios
    Iterator iterador;

    public DataSource() {
        //inicializamos la Coleccion de Usuarios
        this.Usuarios = new ArrayList<Usuario>();
        //En este ciclo for creamos 10 usuarios y los agregamos a la coleccion.
        for (int i = 1; i <=10; i++) {
             Usuario u =new Usuario();
             u.setName("usuario"+String.valueOf(i));
             u.setPwd("12345");
             this.Usuarios.add(u); 
             
        }
        //inicilaizamos el Iterador de la coleccion
        this.iterador = this.Usuarios.iterator();
 
        
    }
    

    /* Este metodo recibe un usuario como parametro y devuelve verdadero 
     * si lo encuentra en la lista de usuario 
     */
    public boolean ConsultarUsuario(Usuario p){
        while (this.iterador.hasNext()){
            Usuario  b =(Usuario) this.iterador.next();
           if (b.getNombre().equals(p.getNombre()) && b.getPwd().equals(p.getPwd())) {
                return true;
            }
           
           
        }
        return false; // si no lo encuentra retorna falso
    }
}

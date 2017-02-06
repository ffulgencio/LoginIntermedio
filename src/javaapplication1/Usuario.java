/*
 * CLase Usuario
 */
package javaapplication1;

/**
 *
 * @author ffulgencio
 */
public class Usuario {
    
    // Atributo nombre de usuario
    private String Name;
    
    //Atributo para la contraseña
    private String Pwd;
    
    //SET
    public void setName(String s){
        this.Name = s;
        
    }
    
    //GET
    public String getNombre(){
        return this.Name;
    }
    
    //SET
    public void setPwd(String s){
        this.Pwd = s;
        
    }
    //GET
    public String getPwd(){
        return this.Pwd;
    }
    
}

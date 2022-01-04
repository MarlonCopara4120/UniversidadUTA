/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomodelamiento;

public class Enfermero extends Gerente {
       public String getUsuario() {
        return usuario;
    }

     
       
       public void Saludar(){
           System.out.println("Vos mismo");    
           System.out.println("Ya mija el sueño");
       }
       
       
       
       
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Enfermero(String usuario, String contraseña) {
        super(usuario, contraseña);
    }
    
    
   
    
}

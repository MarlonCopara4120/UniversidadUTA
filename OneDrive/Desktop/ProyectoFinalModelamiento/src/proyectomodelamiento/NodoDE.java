/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomodelamiento;

/**
 *
 * @author felix
 */
public class NodoDE {
   Object dato;
   NodoDE   siguiente;
   NodoDE   anterior;

   // donde se guarda los objetos?????
   public NodoDE(Object dato){
       this.dato = dato;
       this.siguiente = this.anterior = null;       
   }

   // no se esta usando este metodo
   /*public NodoDE(Object dato, NodoDE siguiente, NodoDE anterior){
       this.dato = dato;
       this.siguiente = siguiente;
       this.anterior  = anterior;
   }
    */
}

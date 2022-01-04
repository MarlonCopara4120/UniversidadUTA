/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomodelamiento;

/**
 *
 * @author copar
 */
public class ListaHistorialClinico {
        NodoDE primero;

    public ListaHistorialClinico() {
        this.primero = null;
    }

    public boolean insertar(Object dato) {
        try {
            if (this.primero == null) { //lista vacía
                this.primero = new NodoDE(dato);
                return true;
            }
            
            NodoDE ultimo = this.primero;

            while (ultimo.siguiente != null) {
                ultimo = ultimo.siguiente;
            }

            ultimo.siguiente = new NodoDE(dato);
            ultimo.siguiente.anterior = ultimo;
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    
    public void imprimir(){
        NodoDE aux = this.primero;
        
        while (aux != null){
            System.out.println(aux.dato.toString());
            aux = aux.siguiente; 
        }
    }
    
    public Object buscar(int pos){
        int posActual = 0;
        NodoDE aux = this.primero;
        while (aux != null && posActual != pos){
            aux = aux.siguiente;
            posActual ++;
        }
        if (aux != null)
            return aux.dato;
        return null;
    }
    public Object buscarHistorialMedico(String cedula){
        NodoDE actual = this.primero;
        while(actual != null){
            if(((HistorialMedico)(actual.dato)).paciente.cedula.equals(cedula)){
                return actual.dato;
            }
            actual = actual.siguiente;
        }
        return null;
    }
    
    public boolean borrar(int pos){
        if (pos < 0) //también correspondería validar que pos no sea mayor que la cantidad de nodos en la estructura (menos uno)
            return false;
        if (pos == 0 )
            if (this.primero != null){
                this.primero = this.primero.siguiente;
                if (this.primero != null)
                    this.primero.anterior = null;
                return true;
            }
            else
                return false;
                
        int posActual = 0;
        pos --;
        NodoDE aux = this.primero;
       
        while (aux != null && posActual < pos){
            aux = aux.siguiente;
            posActual ++;
        }
        
        if (aux != null){
            aux.siguiente = aux.siguiente.siguiente;
            if (aux.siguiente != null)
                aux.siguiente.anterior = aux;
            return true;
        }
        return false;
    }
    
    
    
    
    public boolean borrar(Object dato){
        boolean borrado = false;
        while (this.primero != null && this.primero.dato.equals(dato)){
            this.primero = this.primero.siguiente;
            if (this.primero != null)
                this.primero.anterior = null;
            borrado = true;
        }
        
        if (this.primero != null){
            NodoDE aux = this.primero;
            while (aux.siguiente != null){
                if (aux.siguiente.dato.equals(dato)){ //(aux.siguiente.dato == dato)
                    aux.siguiente = aux.siguiente.siguiente;
                    if (aux.siguiente != null)
                        aux.siguiente.anterior = aux;
                    borrado = true;
                }
                else
                    aux = aux.siguiente;
            }
        }
        return borrado;
    }
    public boolean borrarPorCodigo(String codigo){
        boolean borrado = false;
        while (this.primero != null && ((citaMedica)(this.primero.dato)).codigoCita.equals(codigo)){
            this.primero = this.primero.siguiente;
            if (this.primero != null)
                this.primero.anterior = null;
            borrado = true;
        }
        
        if (this.primero != null){
            NodoDE aux = this.primero;
            while (aux.siguiente != null){
                if (((citaMedica)(aux.siguiente.dato)).codigoCita.equals(codigo)){ //(aux.siguiente.dato == dato)
                    aux.siguiente = aux.siguiente.siguiente;
                    if (aux.siguiente != null)
                        aux.siguiente.anterior = aux;
                    borrado = true;
                }
                else
                    aux = aux.siguiente;
            }
        }
        return borrado;
    }
}

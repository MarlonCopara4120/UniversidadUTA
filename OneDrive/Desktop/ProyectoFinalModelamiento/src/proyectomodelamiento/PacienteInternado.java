/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomodelamiento;

/**
 *
 * @author denni
 */
public class PacienteInternado {
    String sala,area,motivo,codigo;
    int numCama;

    public PacienteInternado(String sala, String area, String motivo, int numCama,String codigo) {
        this.sala = sala;
        this.area = area;
        this.motivo = motivo;
        this.numCama = numCama;
        this.codigo = codigo;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getNumCama() {
        return numCama;
    }

    public void setNumCama(int numCama) {
        this.numCama = numCama;
    }
    
    
}

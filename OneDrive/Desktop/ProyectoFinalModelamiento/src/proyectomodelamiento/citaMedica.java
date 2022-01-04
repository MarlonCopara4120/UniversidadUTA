/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomodelamiento;

/**
 *
 * @author Usuario
 */
public class citaMedica  {
    String horaConsulta,fechaCita,correoElectronico,medicoAsignado,codigoCita;
    Paciente paciente;

    public String getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getMedicoAsignado() {
        return medicoAsignado;
    }

    public void setMedicoAsignado(String medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }

    public String getCodigoCita() {
        return codigoCita;
    }

    public void setCodigoCita(String codigoCita) {
        this.codigoCita = codigoCita;
    }

    public citaMedica(String horaConsulta, String fechaCita, String correoElectronico, 
            String medicoAsignado, String codigoCita, Paciente paciente) {
        this.horaConsulta = horaConsulta;
        this.fechaCita = fechaCita;
        this.correoElectronico = correoElectronico;
        this.medicoAsignado = medicoAsignado;
        this.codigoCita = codigoCita;
        this.paciente = paciente;
    }
    
    
    
    
}

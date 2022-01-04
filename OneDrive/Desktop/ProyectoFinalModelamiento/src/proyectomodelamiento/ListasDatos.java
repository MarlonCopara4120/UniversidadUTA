package proyectomodelamiento;

import java.util.ArrayList;

public class ListasDatos {

    ArrayList<Paciente> pacientes = new ArrayList<>();
    ArrayList<HistorialMedico> historialMedicos = new ArrayList<>();
    ArrayList<Medico> medico = new ArrayList<>();

    public ArrayList<HistorialMedico> getHistorialMedicos() {
        return historialMedicos;
    }

    public void setHistorialMedicos(ArrayList<HistorialMedico> historialMedicos) {
        this.historialMedicos = historialMedicos;
    }

    public void setFichaPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public ArrayList<Paciente> getListaPacientes() {
        return pacientes;
    }
    public void setFichaMedicos(ArrayList<Medico> medico) {
        this.medico = medico;
    }
    public ArrayList<Medico> getListaMedicos() {
        return medico;
    }
    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public void insertarNuevoHistorial(HistorialMedico datos) {
        this.historialMedicos.add(datos);
    }
    public void insertarNuevoMedico(Medico datos) {
        this.medico.add(datos);
    }
    public void insertarNuevoPaciente(Paciente datos) {
        this.pacientes.add(datos);
    }

}

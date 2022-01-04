/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomodelamiento;

import java.util.ArrayList;

public class gestionHospital {

    ArrayList<citaMedica> listaCitasMedicas = new ArrayList();
    ArrayList<HistorialMedico> listaHistorialMedicos = new ArrayList();
    ArrayList<Medico> listaMedicos = new ArrayList();
    ArrayList<Paciente> listaPacientes = new ArrayList();

    public ArrayList<HistorialMedico> getListaHistorialMedicos() {
        return listaHistorialMedicos;
    }

    
    public ArrayList<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

   
    
    

    public boolean insertarCita(citaMedica cita) {
        try {
            listaCitasMedicas.add(cita);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean insertarHistorialMedico(HistorialMedico historialMedico) {
        try {
            listaHistorialMedicos.add(historialMedico);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean insertarMedico(Medico medico) {
        try {
            listaMedicos.add(medico);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean insertarPaciente(Paciente paciente) {
        try {
            listaPacientes.add(paciente);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
/*
    public void mostrarVuelos() {
        for (int i = 0; i < listaVuelos.size(); i++) {
            System.out.println(listaVuelos.get(i).getDestino() + " " + listaVuelos.get(i).getFechaHora()
                    + listaVuelos.get(i).getEspaciosNoReservado());
        }
    }
*/
}

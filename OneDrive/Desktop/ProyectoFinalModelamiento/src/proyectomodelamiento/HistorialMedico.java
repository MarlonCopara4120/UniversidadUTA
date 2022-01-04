/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomodelamiento;

public class HistorialMedico {
    float peso,estatura,temperatura,presionArterial,ritmoCardiaco;
    String alergias,enfermedadesHereditarias,usoMedicamentos,codigohistorial;
    Paciente paciente=new Paciente();
    
    
    PacienteInternado pacienteInternado;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(float presionArterial) {
        this.presionArterial = presionArterial;
    }

    public float getRitmoCardiaco() {
        return ritmoCardiaco;
    }

    public void setRitmoCardiaco(float ritmoCardiaco) {
        this.ritmoCardiaco = ritmoCardiaco;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getEnfermedadesHereditarias() {
        return enfermedadesHereditarias;
    }

    public void setEnfermedadesHereditarias(String enfermedadesHereditarias) {
        this.enfermedadesHereditarias = enfermedadesHereditarias;
    }

    public void setCodigohistorial(String codigohistorial) {
        this.codigohistorial = codigohistorial;
    }

    public String getCodigohistorial() {
        return codigohistorial;
    }

    public String getUsoMedicamentos() {
        return usoMedicamentos;
    }

    public void setUsoMedicamentos(String usoMedicamentos) {
        this.usoMedicamentos = usoMedicamentos;
    }

    public HistorialMedico(float peso, float estatura, float temperatura, float presionArterial, 
            float ritmoCardiaco, String alergias, String enfermedadesHereditarias, 
            String usoMedicamentos, String codigohistorial,Paciente paciente,PacienteInternado pacienteInternado) {
        this.peso = peso;
        this.estatura = estatura;
        this.temperatura = temperatura;
        this.presionArterial = presionArterial;
        this.ritmoCardiaco = ritmoCardiaco;
        this.alergias = alergias;
        this.enfermedadesHereditarias = enfermedadesHereditarias;
        this.usoMedicamentos = usoMedicamentos;
        this.codigohistorial = codigohistorial;
        this.paciente = paciente;
        this.pacienteInternado = pacienteInternado;
    }
    public HistorialMedico(){}

    @Override
    public String toString() {
        return "HistorialMedico{" +
                "peso=" + peso +
                ", estatura=" + estatura +
                ", temperatura=" + temperatura +
                ", presionArterial=" + presionArterial +
                ", ritmoCardiaco=" + ritmoCardiaco +
                ", alergias='" + alergias + '\'' +
                ", enfermedadesHereditarias='" + enfermedadesHereditarias + '\'' +
                ", usoMedicamentos='" + usoMedicamentos + '\'' +
                ", codigohistorial='" + codigohistorial + '\'' +
                ", paciente=" + paciente +
                ", pacienteInternado=" + pacienteInternado +
                '}';
    }
}

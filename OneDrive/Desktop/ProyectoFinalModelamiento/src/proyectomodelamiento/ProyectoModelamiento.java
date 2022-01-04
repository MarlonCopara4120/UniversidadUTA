/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomodelamiento;

public class ProyectoModelamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCitasMedicas c = new ListaCitasMedicas();
        ListaHistorialClinico d = new ListaHistorialClinico();
        ListaPacientes x = new ListaPacientes();
        ListaFichaMedicos f = new ListaFichaMedicos();
        ListaPacienteInternado h = new ListaPacienteInternado();
        Medico m = new Medico("asdad","sadads","asdad","asdad","asdasd","asdads","asdasd","adad","asdsad",26,'m',"Medico1","Medico123");
        f.insertar(m);
        
        Login l = new Login();
        l.menuLogin(d,c,x,f,h);
        
    }

}

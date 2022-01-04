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
public class Login {

    //ListaFichaMedicos f = new ListaFichaMedicos();
    Gerente g = new Gerente("Gerente1", "Gerente123");
    Auxiliar a = new Auxiliar("Auxiliar1", "Auxiliar123");
    Enfermero eN = new Enfermero("Enfermero1", "Enfermero123");

    public void MostrarLoginGerente(ListaHistorialClinico d, ListaCitasMedicas c, ListaPacientes x, ListaFichaMedicos f, ListaPacienteInternado h) {
        Metodos1.titulo2("Inicio Sesión");
        String usuario = Metodos1.leerCadena("Usuario: ");
        String contraseña = Metodos1.leerCadena("Contraseña: ");
        g.setUsuario(usuario);
        g.setContraseña(contraseña);
        loginGerente(d, c, x, f, h);
    }

    public boolean MostrarLoginMedico(ListaHistorialClinico d, ListaCitasMedicas c, ListaPacientes x, ListaFichaMedicos f, ListaPacienteInternado h) {
        Metodos1.titulo2("Inicio Sesión");
        String usuario = Metodos1.leerCadena("Usuario: ");
        String contraseña = Metodos1.leerCadena("Contraseña: ");
        Medico medico = (Medico) (f.buscarMedico(usuario));
        if (medico.usuario.equals(usuario) && medico.contraseña.equals(contraseña)) {
            Menu m = new Menu();
            m.menuMedico(d, c, x, f, h);
        } else {
            System.out.println("Error verificar datos");
        }
        return true;
    }

    public void MostrarLoginAuxiliar(ListaHistorialClinico d, ListaCitasMedicas c, ListaPacientes x, ListaFichaMedicos f, ListaPacienteInternado h) {
        Metodos1.titulo2("Inicio Sesión");
        String usuario = Metodos1.leerCadena("Usuario: ");
        String contraseña = Metodos1.leerCadena("Contraseña: ");
        a.setUsuario(usuario);
        a.setContraseña(contraseña);
        loginAuxiliar(d, c, x, f, h);
    }

    public void MostrarLoginEnfermero(ListaHistorialClinico d, ListaCitasMedicas c, ListaPacientes x, ListaFichaMedicos f, ListaPacienteInternado h) {
        Metodos1.titulo2("Inicio Sesión");
        String usuario = Metodos1.leerCadena("Usuario: ");
        String contraseña = Metodos1.leerCadena("Contraseña: ");
        eN.setUsuario(usuario);
        eN.setContraseña(contraseña);
        loginEnfermero(d, c, x, f, h);
    }

    public boolean loginGerente(ListaHistorialClinico d, ListaCitasMedicas c, ListaPacientes x, ListaFichaMedicos f, ListaPacienteInternado h) {
        try {
            String usuarioGerente = g.getUsuario(), contraseñaGerente = g.getContraseña();
            if (usuarioGerente.equals("Gerente1") && contraseñaGerente.equals("Gerente123")) {
                Menu m = new Menu();
                m.menuGerente(d, c, x, f, h);
            } else {
                System.out.println("Error verificar datos");
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public boolean loginAuxiliar(ListaHistorialClinico d, ListaCitasMedicas c, ListaPacientes x, ListaFichaMedicos f, ListaPacienteInternado h) {
        try {
            String usuarioAuxiliar = a.getUsuario(), contraseñaAuxiliar = a.getContraseña();
            if (usuarioAuxiliar.equals("Auxiliar1") && contraseñaAuxiliar.equals("Auxiliar123")) {
                Menu m = new Menu();
                m.menuAuxiliar(d, c, x, f, h);
            } else {
                System.out.println("Error verificar datos");
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public boolean loginEnfermero(ListaHistorialClinico d, ListaCitasMedicas c, ListaPacientes x, ListaFichaMedicos f, ListaPacienteInternado h) {
        try {
            String usuarioEnfermero = eN.getUsuario(), contraseñaAuxiliar = eN.getContraseña();
            if (usuarioEnfermero.equals("Enfermero1") && contraseñaAuxiliar.equals("Enfermero123")) {
                Menu m = new Menu();
                m.menuEnfermero(d, c, x, f, h);
            } else {
                System.out.println("Error verificar datos");
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public int menuLogin(ListaHistorialClinico d, ListaCitasMedicas c, ListaPacientes x, ListaFichaMedicos f, ListaPacienteInternado h) {
        gestionHospital gH = new gestionHospital();
        int op;
        do {
            System.out.printf("\n%40S\n\n", "Menú de Opciones Login");
            System.out.printf("%10s%s\n%10s%s\n%10s%s\n%10s%s\n%10s%s\n\n",
                    "", "1.-Iniciar sesión Gerente",
                    "", "2.-Iniciar sesión Médico",
                    "", "3.-Iniciar sesión Auxiliar",
                    "", "4.-Iniciar sesión como Enfermero",
                    "", "5.-Salir");
            op = Metodos1.leer("Opción de 1-5");
            if (op < 1 || op > 5) {
                System.out.println("Digitar de 1 a 5");
            }
        } while (op < 1 || op > 5);
        do {
            if (op != 5) {
                switch (op) {
                    case 1:
                        MostrarLoginGerente(d, c, x, f, h);
                        break;
                    case 2:
                        MostrarLoginMedico(d, c, x, f, h);
                        break;
                    case 3:
                        MostrarLoginAuxiliar(d, c, x, f, h);
                        break;
                    case 4:
                        MostrarLoginEnfermero(d, c, x, f, h);
                        break;

                }
            } else {
                System.out.println("Gracias...");
                System.out.println(" ");
            }
        } while (op != 5);
        return op;
    }
}

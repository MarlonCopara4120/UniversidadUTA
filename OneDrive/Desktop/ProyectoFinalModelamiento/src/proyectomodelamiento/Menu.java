/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomodelamiento;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    ListaCitasMedicas c = new ListaCitasMedicas();
    ListaHistorialClinico d = new ListaHistorialClinico();
    ListaPacientes x = new ListaPacientes();
    ListaFichaMedicos f = new ListaFichaMedicos();
    ListaPacienteInternado h = new ListaPacienteInternado();
    gestionHospital g = new gestionHospital();
    HistorialMedico historial = new HistorialMedico();
    ListasDatos listadatos = new ListasDatos();
    Paciente paciente = new Paciente();
    Medico medico = new Medico();
    Login l = new Login();

    public void menuGerente(ListaHistorialClinico d, ListaCitasMedicas c, ListaPacientes x, ListaFichaMedicos f, ListaPacienteInternado h) {
        int op;
        do {
            do {
                System.out.printf("\n%40S\n\n", "Menú de Opciones");
                System.out.printf("%10s%s\n%10s%s\n%10s%s\n%10s%s\n\n",
                        "", "1.-Crear ficha medico",
                        "", "2.-Modificar ficha medico",
                        "", "3.-Eliminar ficha medico",
                        "", "4.-Salir");
                op = Metodos1.leer("Opción de 1-4");
                if (op < 1 || op > 4) {
                    System.out.println("Digitar de 1 a 4");
                }
            } while (op < 1 || op > 4);
            if (op != 4) {
                switch (op) {
                    case 1:
                        InsertarFichaMedico(f);
                        break;
                    case 2:
                        MenuModificarFichaMedico();
                        break;
                    case 3:
                        EliminarFichaMedico(f);
                        break;
                    default:
                        l.menuLogin(d, c, x, f, h);
                }
            }
        } while (op != 4);

        l.menuLogin(d, c, x, f, h);
    }

    public void menuAuxiliar(ListaHistorialClinico d, ListaCitasMedicas c, ListaPacientes x, ListaFichaMedicos f, ListaPacienteInternado h) {

        int op1;
        do {
            do {
                System.out.printf("\n%40S\n\n", "Menú de Opciones");
                System.out.printf("%10s%s\n%10s%s\n%10s%s\n%10s%s"
                        + "\n%10s%s\n%10s%s\n%10s%s\n"
                        + "%10s%s\n%10s%s\n\n",
                        "", "1.-Crear ficha paciente",
                        "", "2.-Modificar ficha paciente",
                        "", "3.-Eliminar ficha paciente",
                        "", "4.-Crear citas medicas",
                        "", "5.-Eliminar citas medicas",
                        "", "6.-Mostrar citas medicas por fecha",
                        "", "7.-Mostrar citas medicas por médico",
                        "", "8.-Mostrar citas medicas por especialidad",
                        "", "9.-Salir");
                op1 = Metodos1.leer("Opción de 1-9");
                if (op1 < 1 || op1 > 9) {
                    System.out.println("Digitar de 1 a 9");
                }
            } while (op1 < 1 || op1 > 9);

            switch (op1) {
                case 1:
                    InsertarFichaPaciente(x);
                    break;
                case 2:
                    MenuModificarFichaPaciente();
                    break;
                case 3:
                    EliminarFichaPaciente(x);
                    break;
                case 4:
                    InsertarCitaMedica(c, x);
                    break;
                case 5:
                    EliminarCita(c);
                    break;
                case 6:
                    c.imprimir();
                    break;
                case 7:

                    break;
                case 8:

                    break;
                default:

            }
        } while (op1 != 9);
        l.menuLogin(d, c, x, f, h);
    }

    public void menuMedico(ListaHistorialClinico d, ListaCitasMedicas c, ListaPacientes x, ListaFichaMedicos f, ListaPacienteInternado h) {
        int op;
        do {
            do {
                System.out.printf("\n%40S\n\n", "Menú de Opciones");
                System.out.printf("%10s%s\n%10s%s\n%10s%s\n%10s%s"
                        + "\n%10s%s\n%10s%s\n%10s%s\n"
                        + "%10s%s\n\n",
                        "", "1.-Crear historial clínico",
                        "", "2.-Modificar historial clinico ",
                        "", "3.-Crear citas medicas",
                        "", "4.-Eliminar citas medicas",
                        "", "5.-Mostrar citas medicas por fecha",
                        "", "6.-Mostrar citas medicas por médico",
                        "", "7.-Mostrar citas medicas por especialidad",
                        "", "8.-Salir");
                op = Metodos1.leer("Opción de 1-9");
                if (op < 1 || op > 8) {
                    System.out.println("Digitar de 1 a 9");
                }
            } while (op < 1 || op > 8);
            if (op != 8) {
                switch (op) {
                    case 1:
                        InsertarHistorialClinico(d, x, h);
                        break;
                    case 2:
                        MenuModificarHistorialClinico();
                        break;
                    case 3:
                        InsertarCitaMedica(c, x);
                        break;
                    case 4:
                        EliminarCita(c);
                        break;
                    case 5:
                        c.imprimir();
                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    default:
                        l.menuLogin(d, c, x, f, h);

                }
            }
        } while (op != 8);
        l.menuLogin(d, c, x, f, h);
    }

    public void menuEnfermero(ListaHistorialClinico d, ListaCitasMedicas c, ListaPacientes x, ListaFichaMedicos f, ListaPacienteInternado h) {
        int op;
        do {
            do {
                System.out.printf("\n%40S\n\n", "Menú de Opciones");
                System.out.printf("%10s%s\n%10s%s\n%10s%s\n%10s%s\n%10s%s\n\n",
                        "", "1.-Crear citas Médicas",
                        "", "2.-Eliminar citas medicas",
                        "", "3.-Crear historial clínico",
                        "", "4.-Modificar historial clínico",
                        "", "5.-Salir");

                op = Metodos1.leer("Opción de 1-5");
                if (op < 1 || op > 5) {
                    System.out.println("Digitar de 1 a 5");
                }
            } while (op < 1 || op > 5);
            if (op != 5) {
                switch (op) {
                    case 1:
                        InsertarCitaMedica(c, x);
                        break;
                    case 2:
                        EliminarCita(c);
                        break;
                    case 3:
                        InsertarHistorialClinico(d, x, h);
                        break;
                    case 4:
                        MenuModificarHistorialClinico();
                        break;
                    default:
                        l.menuLogin(d, c, x, f, h);
                }
            }
        } while (op != 5);
        l.menuLogin(d, c, x, f, h);

    }

    public void InsertarCitaMedica(ListaCitasMedicas c, ListaPacientes x) {
        String correoElectronico, medicoAsignado, fecha, codigoCita, horaCita, cedula;
        Metodos1.titulo2("Ingreso Citas Medicas");
        codigoCita = Metodos1.leerCadena("Cree un Codigo de la cita");
        cedula = Metodos1.leerCadena("Ingrese Número de Cedula");
        fecha = Metodos1.leerCadena("Ingrese fecha de la cita");
        horaCita = Metodos1.leerCadena("Ingrese la hora de la cita");
        correoElectronico = Metodos1.leerCadena("Ingrese correo electronico");
        medicoAsignado = Metodos1.leerCadena("Ingrese medico asignado");
        Paciente paciente = (Paciente) (x.buscarPaciente(cedula));
        if (paciente == null) {
            System.out.println("no existe ese paciente");
        } else {
            c.insertar(new citaMedica(horaCita, fecha, correoElectronico, medicoAsignado, codigoCita, paciente));
            System.out.println("Cita creada");
        }

    }

    public void EliminarCita(ListaCitasMedicas c) {
        String codigoCita;
        Metodos1.titulo2("Elimición citas");
        codigoCita = Metodos1.leerCadena("Ingrese el Codigo de la cita a eliminar");
        c.borrarPorCodigo(codigoCita);
    }

    public void InsertarHistorialClinico(ListaHistorialClinico d, ListaPacientes x, ListaPacienteInternado h) {
        float peso, estatura, temperatura, presionArterial, ritmoCardiaco;
        String alergias, enfermedadesHereditarias, usoMedicamentos, codigohistorial, cedula;
        char internado;
        Metodos1.titulo2("Ingreso Historial Clínico");
        cedula = Metodos1.leerCadena("Ingrese cedula del paciente");
        codigohistorial = Metodos1.leerCadena("Cree un Codigo del historial");
        peso = Metodos1.leerReal("Ingrese el peso: ");
        estatura = Metodos1.leerReal("Ingrese la estatura: ");
        temperatura = Metodos1.leerReal("Ingrese la temperatura:");
        presionArterial = Metodos1.leerReal("Ingrese la presión arterial:");
        ritmoCardiaco = Metodos1.leerReal("Ingrese el ritmo cardiaco:");
        alergias = Metodos1.leerCadena("Ingrese la alergia:");
        enfermedadesHereditarias = Metodos1.leerCadena("Ingrese las enfermedades hereditarias:");
        usoMedicamentos = Metodos1.leerCadena("Ingrese el uso de medicamentos:");
        internado = Metodos1.leerCaracter("El paciente sera internado (s/n): ");
        Paciente paciente = ((Paciente) (x.buscarPaciente(cedula)));

        historial.setPeso(peso);
        historial.setEstatura(estatura);
        historial.setTemperatura(temperatura);
        historial.setRitmoCardiaco(ritmoCardiaco);
        historial.setPresionArterial(presionArterial);
        historial.setAlergias(alergias);
        historial.setEnfermedadesHereditarias(enfermedadesHereditarias);
        historial.setUsoMedicamentos(usoMedicamentos);
        historial.setCodigohistorial(codigohistorial);
        listadatos.insertarNuevoHistorial(historial);

        /*if (paciente == null) {
            System.out.println("Error:Ese paciente no existe");
        } else {
            if (internado == 's') {
                PacienteInternado pacienteInternado = InsertarPacienteInternado(h, d);
                d.insertar(new HistorialMedico(peso, estatura, temperatura, presionArterial,
                        ritmoCardiaco, alergias, enfermedadesHereditarias,
                        usoMedicamentos, codigohistorial, paciente, pacienteInternado));
            } else if (internado == 'n') {
                d.insertar(new HistorialMedico(peso, estatura, temperatura, presionArterial,
                        ritmoCardiaco, alergias, enfermedadesHereditarias,
                        usoMedicamentos, codigohistorial, paciente, null));
                System.out.println("Historial Clinico creada");
            }
        }*/
    }

    public void InsertarFichaPaciente(ListaPacientes x) {
        String nombre, apellido, fechaNacimiento, cedula, direccion, nacionalidad;
        int edad;
        char sexo;
        Metodos1.titulo2("Ingreso Ficha Paciente");
        nombre = Metodos1.leerCadena("Ingrese el nombre: ");
        apellido = Metodos1.leerCadena("Ingrese el apellido: ");
        cedula = Metodos1.leerCadena("Ingrese la cédula: ");
        fechaNacimiento = Metodos1.leerCadena("Ingrese la fecha de nacimiento: ");
        direccion = Metodos1.leerCadena("Ingrese la dirección: ");
        nacionalidad = Metodos1.leerCadena("Ingrese la nacionalidad: ");
        edad = Metodos1.leer("Ingrese la edad: ");
        sexo = Metodos1.leerCaracter("Ingrese el sexo(m/f): ");
        x.insertar(new Paciente(nombre, apellido, fechaNacimiento, cedula, direccion, nacionalidad, edad, sexo));
        System.out.println("Ficha Paciente creada");

        paciente.setNombre(nombre);
        paciente.setApellido(apellido);
        paciente.setCedula(cedula);
        paciente.setFechaNacimiento(fechaNacimiento);
        paciente.setDireccion(direccion);
        paciente.setNacionalidad(nacionalidad);
        paciente.setEdad(edad);
        paciente.setSexo(sexo);
        listadatos.insertarNuevoPaciente(paciente);

    }

    public void EliminarFichaPaciente(ListaPacientes x) {
        String cedula;
        Metodos1.titulo2("Elimición citas");
        cedula = Metodos1.leerCadena("Ingrese la cédula a eliminar:");
        x.borrarPorCedula(cedula);
    }

    public void InsertarFichaMedico(ListaFichaMedicos f) {

        String nombre, apellido, fechaNacimiento, cedula, direccion,
                nacionalidad, especialidad, estudios, experienciaLaboral, usuario, contraseña;
        int edad;
        char sexo;
        Metodos1.titulo2("Ingreso Fichas Medicos");
        cedula = Metodos1.leerCadena("Ingresar número cedula :");
        nombre = Metodos1.leerCadena("Ingresar nombres :");
        apellido = Metodos1.leerCadena("Ingresar apellidos: ");
        fechaNacimiento = Metodos1.leerCadena("Ingresar fecha nacimiento: ");
        edad = Metodos1.leer("Ingresar edad: ");
        sexo = Metodos1.leerCaracter("Ingresar genero: ");
        direccion = Metodos1.leerCadena("Ingresar dirección: ");
        nacionalidad = Metodos1.leerCadena("Ingresar nacionalidad: ");
        especialidad = Metodos1.leerCadena("Ingresar especialidad: ");
        estudios = Metodos1.leerCadena("Ingresar descripcion estudios obtenidos: ");
        experienciaLaboral = Metodos1.leerCadena("Ingresar tiempo experiencia laboral: ");
        usuario = Metodos1.leerCadena("Ingresar nombre usuario: ");
        contraseña = Metodos1.leerCadena("Ingresar contraseña: ");

        f.insertar(new Medico(nombre, apellido, fechaNacimiento, cedula, direccion,
                nacionalidad, especialidad, estudios, experienciaLaboral, edad, sexo, usuario, contraseña));
        System.out.println("Ficha médico creada");

        medico.setCedula(cedula);
        medico.setNombre(nombre);
        medico.setApellido(apellido);
        medico.setFechaNacimiento(fechaNacimiento);
        medico.setEdad(edad);
        medico.setSexo(sexo);
        medico.setDireccion(direccion);
        medico.setNacionalidad(nacionalidad);
        medico.setEspecialidad(especialidad);
        medico.setEstudios(estudios);
        medico.setExperienciaLaboral(experienciaLaboral);
        medico.setUsuario(usuario);
        medico.setContraseña(contraseña);
        listadatos.insertarNuevoMedico(medico);

    }

    public void EliminarFichaMedico(ListaFichaMedicos f) {
        String cedulaMedico;
        Metodos1.titulo2("Elimición ficha médico");
        cedulaMedico = Metodos1.leerCadena("Ingrese la Cedula de la ficha a eliminar");
        f.borrarPorCodigo(cedulaMedico);
    }

    public PacienteInternado InsertarPacienteInternado(ListaPacienteInternado h, ListaHistorialClinico d) {
        String sala, area, motivo, codigo;
        int numCama;
        Metodos1.titulo2("Ingreso Ficha Paciente");
        codigo = Metodos1.leerCadena("Ingresar codigo internado :");
        sala = Metodos1.leerCadena("Ingrese Sala: ");
        area = Metodos1.leerCadena("Ingrese Area: ");
        motivo = Metodos1.leerCadena("Ingrese Motivo: ");
        numCama = Metodos1.leer("Ingrese la edad: ");
        h.insertar(new PacienteInternado(sala, area, motivo, numCama, codigo));
        System.out.println("Ficha Paciente creada");
        return (PacienteInternado) (h.buscarPacienteInternado(codigo));

    }

    // modificar dato paciente escogiendo dato
    public void MenuModificarHistorialClinico() {
        String datoBuscar;
        int aux;
        int opcion;
        float peso, estatura, temperatura, presionArterial, ritmoCardiaco;
        String alergias, enfermedadesHereditarias, usoMedicamentos, codigohistorial;

        ArrayList<HistorialMedico> ListaMedica = new ArrayList<>();

        ListaMedica.addAll(listadatos.getHistorialMedicos());
  

        Scanner tecla = new Scanner(System.in);
        System.out.printf("\n%40S\n", "Modificar Ficha de Paciente");
        System.out.printf("\n%40s", "Codigo del historial del paciente: ");
        datoBuscar = tecla.nextLine();

        for (int i = 0; i < ListaMedica.size(); i++) {
            if (ListaMedica.get(i).getCodigohistorial().equals(datoBuscar)) {
                aux = i;
                System.out.println(ListaMedica.get(aux).toString());
                do {
                    do {

                        System.out.printf("\n%40S\n", "Ficha de Pacientes");
                        System.out.printf("%10s%s\n%10s%s\n%10s%s\n%10s%s"
                                + "\n%10s%s\n%10s%s\n%10s%s\n"
                                + "%10s%s\n%10s%s\n"
                                + "%10s%s\n",
                                "", "1.-Código del Historial",
                                "", "2.-Estatura",
                                "", "3.-Temperatura",
                                "", "4.-Peso",
                                "", "5.-Ritmo Cardiaco",
                                "", "6.-Alergias",
                                "", "7.-Enfermedades Hereditarias",
                                "", "8.-Uso de Medicamentos",
                                "", "9.-Presión Arterial",
                                "", "10.-Salir");
                        System.out.println("Opcion a Modificar: ");
                        opcion = Integer.valueOf(tecla.nextLine());
                        if (opcion < 1 || opcion > 10) {
                            System.out.println("Digitar de 1 a 10");
                        }
                    } while (opcion < 1 || opcion > 10);
                    // if (opcion != 10) {
                    switch (opcion) {
                        case 1:
                            codigohistorial = Metodos1.leerCadena("Codigo Historial");
                            ListaMedica.get(aux).setCodigohistorial(codigohistorial);
                            System.out.println(ListaMedica.get(aux).toString());
                            break;
                        case 2:
                            estatura = Metodos1.leerReal("Estatura: ");
                            ListaMedica.get(aux).setEstatura(estatura);
                            System.out.println(ListaMedica.get(aux).toString());
                            break;
                        case 3:
                            temperatura = Metodos1.leerReal("Temperatura: ");
                            ListaMedica.get(aux).setTemperatura(temperatura);
                            System.out.println(ListaMedica.get(aux).toString());
                            break;
                        case 4:
                            peso = Metodos1.leerReal("Peso: ");
                            ListaMedica.get(aux).setPeso(peso);
                            System.out.println(ListaMedica.get(aux).toString());
                            break;
                        case 5:
                            ritmoCardiaco = Metodos1.leerReal("Ritmo Cardiaco: ");
                            ListaMedica.get(aux).setRitmoCardiaco(ritmoCardiaco);
                            System.out.println(ListaMedica.get(aux).toString());
                            break;
                        case 6:
                            alergias = Metodos1.leerCadena("Alergias: ");
                            ListaMedica.get(aux).setAlergias(alergias);
                            System.out.println(ListaMedica.get(aux).toString());
                            break;
                        case 7:
                            enfermedadesHereditarias = Metodos1.leerCadena("Enfermedades Hereditarias: ");
                            ListaMedica.get(aux).setEnfermedadesHereditarias(enfermedadesHereditarias);
                            System.out.println(ListaMedica.get(aux).toString());
                            break;
                        case 8:
                            usoMedicamentos = Metodos1.leerCadena("Uso Medicamentos: ");
                            ListaMedica.get(aux).setUsoMedicamentos(usoMedicamentos);
                            System.out.println(ListaMedica.get(aux).toString());
                            break;
                        case 9:
                            presionArterial = Metodos1.leerReal("Presión Arterial: ");
                            ListaMedica.get(aux).setPresionArterial(presionArterial);
                            System.out.println(ListaMedica.get(aux).toString());
                            break;
                        case 10:

                    }

                    System.out.println(" ");
                } while (opcion != 10);

            }
            break;
        }
    }

    public void MenuModificarFichaPaciente() {
        String datoBuscar;
        int opcion;
        int aux;
        String nombre, apellido, fechaNacimiento, cedula, direccion,
                nacionalidad;
        int edad;
        char sexo;
        ArrayList<Paciente> ListaPaciente = new ArrayList<>();

        ListaPaciente.addAll(listadatos.getListaPacientes());


        Scanner tecla = new Scanner(System.in);
        System.out.printf("\n%40S\n", "Modificar Ficha del Paciente");
        System.out.printf("\n%40s", "Cédula del paciente: ");
        datoBuscar = tecla.nextLine();

        for (int i = 0; i < ListaPaciente.size(); i++) {
            if (ListaPaciente.get(i).getCedula().equals(datoBuscar)) {
                aux = i;
                System.out.println(ListaPaciente.get(aux).toString());
                do {

                    do {

                        System.out.printf("\n%40S\n", "Ficha de Pacientes");
                        System.out.printf("%10s%s\n%10s%s\n%10s%s\n%10s%s"
                                + "\n%10s%s\n%10s%s\n%10s%s\n"
                                + "%10s%s\n%10s%s\n\n",
                                "", "1.-Nombre",
                                "", "2.-Apellido",
                                "", "3.-Fecha de Nacimiento",
                                "", "4.-Cédula",
                                "", "5.-Dirección",
                                "", "6.-Edad",
                                "", "7.-Nacionalidad",
                                "", "8.-Sexo",
                                "", "9.-Salir");
                        System.out.println("Opcion a Modificar: ");
                        opcion = Integer.valueOf(tecla.nextLine());
                        if (opcion < 1 || opcion > 9) {
                            System.out.println("Digitar de 1 a 9");
                        }
                    } while (opcion < 1 || opcion > 9);

                    switch (opcion) {
                        case 1:
                            nombre = Metodos1.leerCadena("Nombre:");
                            ListaPaciente.get(aux).setNombre(nombre);
                            System.out.println(ListaPaciente.get(aux).toString());
                            break;
                        case 2:
                            apellido = Metodos1.leerCadena("Apellido: ");
                            ListaPaciente.get(aux).setApellido(apellido);
                            System.out.println(ListaPaciente.get(aux).toString());
                            break;
                        case 3:
                            fechaNacimiento = Metodos1.leerCadena("Fecha de Nacimiento: ");
                            ListaPaciente.get(aux).setFechaNacimiento(fechaNacimiento);
                            System.out.println(ListaPaciente.get(aux).toString());
                            break;
                        case 4:
                            cedula = Metodos1.leerCadena("Cédula: ");
                            ListaPaciente.get(aux).setCedula(cedula);
                            System.out.println(ListaPaciente.get(aux).toString());
                            break;
                        case 5:
                            direccion = Metodos1.leerCadena("Dirección: ");
                            ListaPaciente.get(aux).setDireccion(direccion);
                            System.out.println(ListaPaciente.get(aux).toString());
                            break;
                        case 6:
                            edad = Metodos1.leer("Edad: ");
                            ListaPaciente.get(aux).setEdad(edad);
                            System.out.println(ListaPaciente.get(aux).toString());

                            break;
                        case 7:
                            nacionalidad = Metodos1.leerCadena("Nacionalidad: ");
                            ListaPaciente.get(aux).setNacionalidad(nacionalidad);
                            System.out.println(ListaPaciente.get(aux).toString());
                            break;
                        case 8:
                            sexo = Metodos1.leerCaracter("Sexo: ");
                            ListaPaciente.get(aux).setSexo(sexo);
                            System.out.println(ListaPaciente.get(aux).toString());
                            break;
                        case 9:

                    }

                    System.out.println(" ");
                } while (opcion != 9);

            }
            break;
        }
    }

    public void MenuModificarFichaMedico() {
        HistorialMedico h = new HistorialMedico();
        String datoBuscar;
        int aux;
        int opcion;
        String nombre, apellido, fechaNacimiento, cedula, direccion,
                nacionalidad, especialidad, estudios, experienciaLaboral;
        int edad;
        char sexo;
        ArrayList<Medico> ListaMedicos = new ArrayList<>();

        ListaMedicos.addAll(listadatos.getListaMedicos());

        Scanner tecla = new Scanner(System.in);
        System.out.printf("\n%40S\n", "Modificar Ficha del Médico");
        System.out.printf("\n%40s", "Cédula del Médico: ");
        datoBuscar = tecla.nextLine();

        for (int i = 0; i < ListaMedicos.size(); i++) {
            if (ListaMedicos.get(i).getCedula().equals(datoBuscar)) {
                aux = i;
                System.out.println(ListaMedicos.get(aux).toString());
                do {

                    do {

                        System.out.printf("\n%40S\n", "Ficha de Pacientes");
                        System.out.printf("%10s%s\n%10s%s\n%10s%s\n%10s%s"
                                + "\n%10s%s\n%10s%s\n%10s%s\n%10s%s\n%10s%s\n%10s%s\n"
                                + "%10s%s\n%10s%s\n\n",
                                "", "1.-Nombre",
                                "", "2.-Apellido",
                                "", "3.-Fecha de Nacimiento",
                                "", "4.-Cédula",
                                "", "5.-Dirección",
                                "", "6.-Nacionalidad",
                                "", "7.-Especialidad",
                                "", "8.-Estudios",
                                "", "9.-Experiencia Laboral",
                                "", "10.-Edad",
                                "", "11.-Sexo",
                                "", "12.-Salir");
                        System.out.println("Opcion a Modificar: ");
                        opcion = Integer.valueOf(tecla.nextLine());
                        if (opcion < 1 || opcion > 12) {
                            System.out.println("Digitar de 1 a 12");
                        }
                    } while (opcion < 1 || opcion > 12);
                   
                    switch (opcion) {
                        case 1:
                            nombre = Metodos1.leerCadena("Nombre: ");
                            ListaMedicos.get(aux).setNombre(nombre);
                            System.out.println(ListaMedicos.get(aux).toString());
                            break;
                        case 2:
                            apellido = Metodos1.leerCadena("Apellido: ");
                            ListaMedicos.get(aux).setApellido(apellido);
                            System.out.println(ListaMedicos.get(aux).toString());
                            break;
                        case 3:
                            fechaNacimiento = Metodos1.leerCadena("Fecha de Nacimiento: ");
                            ListaMedicos.get(aux).setFechaNacimiento(fechaNacimiento);
                            System.out.println(ListaMedicos.get(aux).toString());
                            break;
                        case 4:
                            cedula = Metodos1.leerCadena("Cédula: ");
                            ListaMedicos.get(aux).setCedula(cedula);
                            System.out.println(ListaMedicos.get(aux).toString());
                            break;
                        case 5:
                            direccion = Metodos1.leerCadena("Dirección: ");
                            ListaMedicos.get(aux).setDireccion(direccion);
                            System.out.println(ListaMedicos.get(aux).toString());
                            break;
                        case 6:
                            nacionalidad = Metodos1.leerCadena("Nacionalidad: ");
                            ListaMedicos.get(aux).setNacionalidad(nacionalidad);
                            System.out.println(ListaMedicos.get(aux).toString());
                            break;
                        case 7:
                            especialidad = Metodos1.leerCadena("Epecialidad: ");
                            ListaMedicos.get(aux).setEspecialidad(especialidad);
                            System.out.println(ListaMedicos.get(aux).toString());
                            break;
                        case 8:
                            estudios = Metodos1.leerCadena("Estudios: ");
                            ListaMedicos.get(aux).setEstudios(estudios);
                            System.out.println(ListaMedicos.get(aux).toString());
                            break;
                        case 9:
                            experienciaLaboral = Metodos1.leerCadena("Experiencia Laboral: ");
                            ListaMedicos.get(aux).setExperienciaLaboral(experienciaLaboral);
                            System.out.println(ListaMedicos.get(aux).toString());
                            break;
                        case 10:
                            edad = Metodos1.leer("Edad: ");
                            ListaMedicos.get(aux).setEdad(edad);
                            System.out.println(ListaMedicos.get(aux).toString());
                            break;
                        case 11:
                            sexo = Metodos1.leerCaracter("Sexo: ");
                            ListaMedicos.get(aux).setSexo(sexo);
                            System.out.println(ListaMedicos.get(aux).toString());
                            break;
                        case 12:

                            break;
                    }

                    System.out.println(" ");
                } while (opcion != 12);

                break;
            }
        }
    }
}

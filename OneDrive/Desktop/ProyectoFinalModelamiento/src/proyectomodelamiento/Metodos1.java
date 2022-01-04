package proyectomodelamiento;

import java.util.Scanner;

public class Metodos1 {

    public static void autor() {
        System.out.printf("%48s\n", "Dennis Bonilla");
        System.out.printf("%60s\n", "dennissbonilla@hotmail.com");

    }

    public static void empresa() {
        System.out.printf("%44s\n", "Distribuidora Facilito");
        System.out.printf("%40s\n", "Baños Ecuador");
    }

    public static void titulo1(String mensaje) {
        System.out.printf("%40S\n\n", mensaje);
    }

    public static void titulo2(String mensaje) {
        int largo, i;
        largo = mensaje.length();
        for (i = 1; i <= 40 - largo; i++) {
            System.out.print(" ");
        }
        for (i = 1; i <= largo; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.printf("%40S\n\n", mensaje);

    }

    public static int azar() {
        int x;
        x = (int) (Math.random() * 10 + 1);

        return x;
    }

    public static int azar(int lim) {
        int x;
        x = (int) (Math.random() * lim + 1);

        return x;
    }

    public static int azar(int a, int b) {
        int x;
        x = (int) (Math.random() * (b - a + 1) + a);

        return x;
    }

    public static float librasKg(float m) {
        float z;
        z = m / 2.2f;

        return z;
    }

    public static float cuadrada(float n) {
        float j;
        j = n * n;

        return j;
    }

    public static float descuento(float a, float r) {
        float d, j;
        d = r / 100;
        j = a * d;

        return j;
    }

    public static float valorIva(float n) {
        float k;
        k = n * 12 / 100;
        return k;
    }

    public static float vInclIva(float p, float r) {
        float m;
        m = p + r;
        return m;
    }

    public static void mensaje(String mensaje) {
        System.out.printf("%30s%s", mensaje, " => ");
    }

    public static int leer(String cadena) {
        int num;
        String aux;
        Scanner tt = new Scanner(System.in);
        mensaje(cadena);
        aux = tt.nextLine().trim();
        if (aux.isEmpty()) {
            num = 0;

        } else {

            num = Integer.valueOf(aux);
        }
        return num;
    }
    public static String leerCadena(String cadena) {
        
        String aux;
        Scanner tt = new Scanner(System.in);
        mensaje(cadena);
        aux = tt.nextLine().trim();
        
        return aux;
    }
    public static float leerReal(String cadena) {
        float num;
        String aux;
        Scanner tt = new Scanner(System.in);
        mensaje(cadena);
        aux = tt.nextLine().trim();
        if (aux.isEmpty()) {
            num = 0;

        } else {

            num = Float.valueOf(aux);
        }
        return num;
    }
   public static void mensajeAviso(String mensaje) {
        System.out.println("Error:"+ mensaje + "... ");
    }
   public static void mensajeSimple(String mensaje) {
        System.out.printf("%30s%s", mensaje, " ");
    }
    public static char preguntaSN(String cadena) {
        char preg;
        Scanner tt = new Scanner(System.in);
       do{
        mensaje(cadena + "(S/N)"); 
        preg = tt.nextLine().trim().toUpperCase().charAt(0);
       if(preg != 'S' && preg != 'N'){
          mensajeAviso("S = SI, N = NO"); 
       }
       }while(preg != 'S' && preg != 'N');
        return preg;
    }
    
  
     
     
     public static char leerCaracter(String cadena) {
        char aux;        
        Scanner tt = new Scanner(System.in);
        mensaje(cadena);
        aux = tt.nextLine().charAt(0);
        return aux;
    }
    
}

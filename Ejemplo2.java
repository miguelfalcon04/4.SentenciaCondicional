import java.util.Scanner;

public class Ejemplo2 {
    public static Scanner sc = null;

    /**
     * iniciar
     * Inicia el Scanner para poder leer desde teclado
     */
    public static void iniciar(){
        sc = new Scanner(System.in);
    
    }

    /**
     * Cierra el Scanner para liberar recursos
     */
    public static void finalizar(){
        sc.close();
    }

    /**
     * Muestra el menú de la aplicación en la consola
     */
    public static void mostrarMenu(){
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Salir");
    }

    /**
     * Solicita la opción del menú
     * @return la opcion elagida en formato int
     */
    public static int pedirOpcion(){
        return sc.nextInt();
    }

    /**
     * 
     * @param a
     * @param b
     * @return
     */
    public static int sumar(int a, int b){
        return a+b;
    }

    /**
     * 
     * @param a
     * @param b
     * @return La resta de a-b
     */
    public static int restar(int a, int b){
        return a-b;
    }

    /**
     * Punto de entrada de nuestro programa
     * @param args
     */
    public static void main(String[] args) {
        iniciar();
        mostrarMenu();
        int opcion = pedirOpcion();
        int a, b;
        switch(opcion){
            case 1:
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.printf("%d + %d = %d",a,b,sumar(a, b));
            break;
            case 2:
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.printf("%d - %d = %d",a,b,restar(a, b));
            break;
            case 3:
                System.out.println("Hasta luego");
            break;
            default:
            System.out.println("Opción errónea");
        }
        finalizar();
    }
}

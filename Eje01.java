/*Ejercicio 1
Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.
*/

import java.util.Scanner;
public class Eje01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Día de la semana: ");
        String dia = sc.nextLine();

        switch (dia){
            case "lunes":
            System.out.println("Programación");
            break;

            case "martes":
            System.out.println("SSII");
            break;

            case "miercoles":
            System.out.println("Entornos");
            break;

            case "jueves":
            System.out.println("Programación");
            break;

            case "viernes":
            System.out.println("FOL");
            break;

            default:
            System.out.println("Introduce un día válido");
            break;
        }
        sc.close();
    }
}
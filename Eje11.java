/*Ejercicio 11
Escribe un programa que dada una hora determinada (horas y minutos), calcule
los segundos que faltan para llegar a la medianoche. 
*/

import java.util.Scanner;

public class Eje11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la hora: ");
        int h = Integer.parseInt(sc.nextLine());

        System.out.print("Introduce los minutos: ");
        int min = Integer.parseInt(sc.nextLine());

        int segundos = ((24-h)*3600) + ((60-min)*60);

        System.out.printf("Faltan %d segundos hasta media noche",segundos);
        sc.close();
    }
}

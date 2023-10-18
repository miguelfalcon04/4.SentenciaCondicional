/*Ejercicio 7
Realiza un programa que calcule la media de tres notas.
*/

import java.util.Scanner;
public class Eje07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float suma=0;

        for(int i=0; i<=2; i++){
            System.out.printf("Introduzca su %dº nota: ",i+1);
            float nota = Float.parseFloat(sc.nextLine());
            suma+=nota;
        }

        System.out.printf("La media de sus notas es: %.2f", suma/3);
        sc.close();
    }
}

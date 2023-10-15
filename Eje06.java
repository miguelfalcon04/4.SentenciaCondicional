/*Ejercicio 6
Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t = √2hg siendo g = 9.81m/s2 */

import java.util.Scanner;
public class Eje06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Desde que altura(m) cae el objeto? ");
        int alt = Integer.parseInt(sc.nextLine());

        System.out.printf("Tardará en caer %.2f segundos", Math.sqrt((2*alt)/9.81));
        sc.close();
    }
}

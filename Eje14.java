/*Ejercicio 14
Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5.
*/

import java.util.Scanner;
public class Eje14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su número: ");
        int n = Integer.parseInt(sc.nextLine());

        if(n%2==0 && n%5==0){
            System.out.print("Es par y divisible entre 5");
        }else if(n%5==0){
            System.out.println("Divisible entre 5");
        }else if(n%2==0){
            System.out.println("Es par");
        }

        sc.close();
    }
}

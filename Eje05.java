/*Ejercicio 5
Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =0).
*/

import java.util.Scanner;
public class Eje05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce a: ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.print("Introduce b: ");
        int b = Integer.parseInt(sc.nextLine());

        if(a!=0){
            System.out.printf("%dx+%d = %.2f", a , b, ((float)-b/(float)a));
        }else{
            System.out.println("Esa ecuación no tiene solución real.");
        }

        sc.close();
    }
}

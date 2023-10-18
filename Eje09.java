/*Ejercicio 9
Realiza un programa que resuelva una ecuación de segundo grado (del tipo
ax2 + bx + c = 0).
*/

import java.util.Scanner;
public class Eje09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce b: ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce c: ");
        int c = Integer.parseInt(sc.nextLine());

        float formulaPos = (float) (-b+Math.sqrt((b*b)-4*a*c))/2*a;
        float formulaNeg = (float) (-b-Math.sqrt((b*b)-4*a*c))/2*a;

        System.out.printf("La solución positiva es: %.2f\nLa solución negativa es: %.2f",formulaPos,formulaNeg);
        sc.close();
    }
}

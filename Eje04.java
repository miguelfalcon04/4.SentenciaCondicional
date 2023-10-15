/*Ejercicio 4
Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora.
*/

import java.util.Scanner;
public class Eje04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Horas trabajadas esta semana: ");
        int h = Integer.parseInt(sc.nextLine());

        if(h<=40){
            System.out.println("Su salario es de: " + (h*12));
        }else{
            System.out.printf("Su salario base es de %d y de horas extra gana %d",(40*12),((h-40)*16));
        }

        sc.close();
    }
}

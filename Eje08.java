/*Ejercicio 8
Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).
*/

import java.util.Scanner;
public class Eje08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float suma=0;
        float media;

        for(int i=0; i<=2; i++){
            System.out.printf("Introduzca su %dº nota: ",i+1);
            float nota = Float.parseFloat(sc.nextLine());
            suma+=nota;
        }

        media = suma/3;
        System.out.printf("La media de sus notas es: %.2f\n", media);
        if(media>0 && media<3){
            System.out.println("INSUFICIENTE");
        }else if(media>=3 && media<5){
            System.out.println("SUFICIENTE");
        }else if(media>=5 && media<7){
            System.out.println("BIEN");
        }else if(media>=7 && media<9){
            System.out.println("NOTABLE");
        }else if(media>=9 && media<=10){
            System.out.println("SOBRESALIENTE");
        }else{
            System.out.println("Nota fuera de rango");
        }
        sc.close();
    }
}

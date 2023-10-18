/*Ejercicio 10
Escribe un programa que nos diga el horóscopo a partir del día y el mes de
nacimiento.
*/
import java.util.Scanner;
public class Eje10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Día de nacimiento: ");
        int dia = Integer.parseInt(sc.nextLine());
        System.out.print("Mes de nacimiento: ");
        String mes = sc.nextLine();

        switch (mes){
            case "Enero":
                if (dia<=19){
                    System.out.println("Eres Capricornio");
                }else{
                    System.out.println("Eres Acuario");
                }
            break;

            case "Febrero":
                if(dia<=18){
                    System.out.println("Eres Acuario");
                }else{
                    System.out.println("Eres Piscis");
                }
            break;

            case "Marzo":
                if(dia<=20){
                    System.out.println("Eres Piscis");
                }else{
                    System.out.println("Eres Aries");
                }
            break;

            case "Abril":
                if(dia<=19){
                    System.out.println("Eres Aries");
                }else{
                    System.out.println("Eres Tauro");
                }
            break;

            case "Mayo":
                if(dia<=20){
                    System.out.println("Eres Tauro");
                }else{
                    System.out.println("Eres Geminis");
                }
            break;

            case "Junio":
                if(dia<=20){
                    System.out.println("Eres Geminis");
                }else{
                    System.out.println("Eres Cáncer");
                }
            break;

            case "Julio":
                if(dia<=22){
                    System.out.println("Eres Cáncer");
                }else{
                    System.out.println("Eres Leo");
                }
            break;

            case "Agosto":
                if(dia<=22){
                    System.out.println("Eres Leo");
                }else{
                    System.out.println("Eres Virgo");
                }
            break;        

            case "Septiembre":
                if(dia<=22){
                    System.out.println("Eres Virgo");
                }else{
                    System.out.println("Eres Libra");
                }
            break;

            case "Octubre":
                if(dia<=22){
                    System.out.println("Eres Libra");
                }else{
                    System.out.println("Eres Escorpio");
                }
            break;

            case "Noviembre":
                if(dia<=21){
                    System.out.println("Eres Escorpio");
                }else{
                    System.out.println("Eres Sagitario");
                }
            break;

            case "Diciembre":
                if(dia<=21){
                    System.out.println("Eres Sagitario");
                }else{
                    System.out.println("Eres Capricornio");
                }
            break;
        }

        sc.close();
    }    
}

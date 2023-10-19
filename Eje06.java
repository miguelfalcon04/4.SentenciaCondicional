/*Ejercicio 6
Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t = √2hg siendo g = 9.81m/s2 */

public class Eje06 {
    public static void main(String[] args) {
        System.out.println("Calcula el timpo en que tarda caer un objeto");
        try{
            float g = 9.81f;
            System.out.print("Por favor, introduzca la altura: ");
            int h = Integer.parseInt(System.console().readLine());
            double t = Math.sqrt(2+h/g);
            if(Double.valueOf(t).isNaN()){
                System.out.println("No es posible calcular el tiempo con altura negativa");
            }else{
                System.out.printf("El objeto tarde en caer %.2f",t);
            }
        }catch(NumberFormatException e){
            System.out.println("Error en la introducción de datos");
        }catch(Exception e){
            System.out.println("Error inesperado");
        }

    }
}

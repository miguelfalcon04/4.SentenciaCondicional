import java.util.Scanner;

public class Examen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int opcionAl = 0;
        int iva = 0;
        String nomProd = "";
        int cantProd = 0;
        float precioProd = 0;

        System.out.println("Introduzca el tipo de producto:");
        System.out.println("1. Alimentación");
        System.out.println("2. Electrónica");
        System.out.println("3. Farmacia");
        System.out.println("4. Moda");
        System.out.print("Opción: ");
        opcion = Integer.parseInt(sc.nextLine());

        switch(opcion){

            //ALIMENTACIÓN
            case 1:
            System.out.println("Introduzca el tipo de alimento");
            System.out.println("1. Huevos");
            System.out.println("2. Leche");
            System.out.println("4. Pan");
            System.out.println("5. Fruta");
            System.out.println("6. Verdura");
            System.out.println("7. Otros");
            System.out.print("Opción: ");
            opcionAl = Integer.parseInt(sc.nextLine());

            if(opcionAl==7){
                iva = 10;
            }else{
                iva = 4;
            }

            System.out.print("Introduzca el nombre del producto: ");
            nomProd = sc.nextLine();
            System.out.print("Introduzca la cantidad de productos: ");
            cantProd = Integer.parseInt(sc.nextLine());
            System.out.print("Introduzca el precio por unidad de producto: ");
            precioProd = Float.parseFloat(sc.nextLine());
            break;

            //ELECTRÓNICA
            case 2:
            iva = 21;

            System.out.print("Introduzca el nombre del producto: ");
            nomProd = sc.nextLine();
            System.out.print("Introduzca la cantidad de productos: ");
            cantProd = Integer.parseInt(sc.nextLine());
            System.out.print("Introduzca el precio por unidad de producto: ");
            precioProd = Float.parseFloat(sc.nextLine());
            break;

            //FARMACIA
            case 3:
            iva = 4;

            System.out.print("Introduzca el nombre del producto: ");
            nomProd = sc.nextLine();
            System.out.print("Introduzca la cantidad de productos: ");
            cantProd = Integer.parseInt(sc.nextLine());
            System.out.print("Introduzca el precio por unidad de producto: ");
            precioProd = Float.parseFloat(sc.nextLine());
            break;

            //MODA
            case 4:
            iva = 21;

            System.out.print("Introduzca el nombre del producto: ");
            nomProd = sc.nextLine();
            System.out.print("Introduzca la cantidad de productos: ");
            cantProd = Integer.parseInt(sc.nextLine());
            System.out.print("Introduzca el precio por unidad de producto: ");
            precioProd = Float.parseFloat(sc.nextLine());
            break;

            default:
            System.out.println("Introduzca una opción válida");
        }

        float total = cantProd*precioProd;
        float ivaTot = (total*iva)/100;

        float descuento20 = (total*20)/100;
        float totalDesc20 = total-descuento20;
        float ivaTot20 = (totalDesc20*iva)/100;

        int cant3x2 = (cantProd- cantProd/3);
        float descuento3x2 = total-(precioProd*cant3x2);
        float totalDesc3x2 = total - descuento3x2;
        float ivaTot3x2 = (totalDesc3x2*iva)/100;

        System.out.println("");
        System.out.println("Factura");
        System.out.println("________________________________________");
        System.out.printf("Artículo %31s\n",nomProd);
        System.out.printf("Precio %24.2f €/unidad\n",precioProd);
        System.out.printf("Cantidad %31d\n",cantProd);
        System.out.printf("Total %33.2f€\n",total);

        if(opcion==2){
            System.out.printf("Descuento (20%%) %23.2f€\n",(-1)*descuento20);
            System.out.printf("Total con descuento %19.2f€\n",totalDesc20);
            System.out.printf("IVA al %d%% %28.2f€\n",iva,ivaTot20);
            System.out.println("________________________________________");
            System.out.printf("Total con IVA %25.2f€\n",(totalDesc20+ivaTot20));

        }else if(opcion==4){
            System.out.printf("Descuento (3x2)  %23.2f\n",(-1)*descuento3x2);
            System.out.printf("Total con descuento %19.2f€\n",totalDesc3x2);
            System.out.printf("IVA al %d%% %28.2f€\n",iva,ivaTot3x2);
            System.out.println("________________________________________");
            System.out.printf("Total con IVA %25.2f€\n",(totalDesc3x2+ivaTot3x2));

        }else{
            if(iva<=9){
                System.out.printf("IVA al %d%% %29.2f€\n",iva,ivaTot);
            }else{
                System.out.printf("IVA al %d%% %28.2f€\n",iva,ivaTot);
            }
            System.out.println("________________________________________");
            System.out.printf("Total con IVA %25.2f€\n",(total+ivaTot));
        }

        sc.close();
    }
}
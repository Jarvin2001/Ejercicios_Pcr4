package EJERCICIOS;

//importando libreria para poder usar el escaner y capturar lo que digita el usuario
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        double compra, total;
        int bolita;
        //para poder capturar informacion ingresada por el usuario se define una variable de tipo Scanner
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el monto de la compra: ");
        compra = leer.nextDouble();
        System.out.println("Elija la bolita roja=1, verde=2, blanca=3: ");
        bolita = leer.nextInt();
        //en el switch se evalua el numero que viene en la bolita si es 1, 2 o 3 o el default en el caso que se haya digitado
        //un numero que no aplica o que este vacio
        switch (bolita) {
            case 1:
                total = compra - (compra * 0.10);
                System.out.println("Total a pagar con descuento del 10%: " + total);
                break;
            case 2:
                total = compra - (compra * 0.05);
                System.out.println("Total a pagar con descuento del 5%: " + total);
                break;
            default:
                System.out.println("Lo sentimos no aplica al descuento, Muchas Gracias");
                break;
        }

    }

}

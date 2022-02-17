package EJERCICIOS;

//importando libreria para poder usar el escaner y capturar lo que digita el usuario
import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        int cantidadNumeros, numeroMayor = 0, numeroMenor = 0, cantidadPares = 0, numero;

        Scanner leer = new Scanner(System.in);

        System.out.println("Cuantos numeros va a ingresar? ingrese la cantidad: ");
        cantidadNumeros = leer.nextInt();
        //ingresando al ciclo for dara las vueltas dependiendo del numero ingresado 
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Ingrese el numero: ");
            numero = leer.nextInt();

            //se verifica primero que el numero no sea negativo se le manda msj al usuario 
            //y se retorna(ya no sigue con el proceso el programa llega a su fin)
            if (numero < 0) {
                System.out.println("No se permiten numeros negativos!");
                return;
            }

            //se pregunta si el numero es mayor al que esta guardado en la variable numeroMayor es decir que es el numero 
            //numero mayor que quedara guardado o si es 0 es decir que es la primera vez que el ciclo se ha ejecutado y se asiganara
            //el primer numero que viene como mayor lo mismo sucede con el numero menor
            if (numero > numeroMayor || numeroMayor == 0) {
                numeroMayor = numero;
            }

            if (numero < numeroMenor || numeroMenor == 0) {
                numeroMenor = numero;
            }
            
            //se pregunta si el numero es divisible entre 2 usando el operador % == si el residuo es 0 cumple la condicion
            if (numero % 2 == 0) {
                //incrementando en 1 la cantidadPares
                cantidadPares++;
            }
        }
        
        System.out.println("Numero Mayor: " + numeroMayor);
        System.out.println("Numero menor: " + numeroMenor);
        System.out.println("Numero Cantidad Pares: " + cantidadPares);

    }

}

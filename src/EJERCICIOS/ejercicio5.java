package EJERCICIOS;


import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        int numero, numeroMayor = 0, numeroMenor = 0, suma = 0, aumento, decremento;
        boolean dioDocientos = false;

        Scanner leer = new Scanner(System.in);

        for (int i = 4; i > 0; i--) {

            System.out.println("Ingrese el numero: ");
            numero = leer.nextInt();
            //acumulador donde se guarda la suma de los numeros que se van ingresando
            suma = suma + numero;
            if (suma >= 200) {
                System.out.println("La suma de numeros dio 200 no se puede continuar :( ingrese todos los numeros de nuevo!");
                //se vuelven a formatear las variables para que todo entre en limpio
                suma = 0;
                //se le asigna 5 porque ya esta dentro del for y aca for (int i = 4; i > 0; i--) al volver ya le restaria 
                //1 entonces para que de las 4 vueltas se le asigna 5 para que cuando reste ya entre 4 veces
                i = 5;
                numeroMayor = 0;
                numeroMenor = 0;
                //variable booleana cambia a true porque la suma ya dio docientos o mas por lo tanto no se ejecutara el siguiente codigo
                dioDocientos = true;
            }

            //la variable booleana dioDocientos es por si la suma arriba ya dio 200 no ejecute este codigo no es necesario
            if (!dioDocientos) {

                //se verifica primero que el numero no sea negativo se le manda msj al usuario 
                //y se retorna(ya no sigue con el proceso el programa llega a su fin)
                if (numero < 0) {
                    System.out.println("No se permiten numeros negativos!");
                    System.out.println("Vuelva a ingresar el numero: ");
                    numero = leer.nextInt();
                }

                //se pregunta si el numero es mayor al que esta guardado en la variable numeroMayor es decir que es el numero 
                //numero mayor que quedara guardado o si es 0 es decir que es la primera vez que el ciclo se ha ejecutado y se asiganara
                //el primer numero que viene como mayor lo mismo sucede con el numero menor
                if (numero > numeroMayor || numeroMayor == 0) {

                    //se pregunta si el numeroMenor es mayor a 10 se le suma 10 al numeroMayor sino aumento 0 no afecta en nada
                    if (numeroMenor > 10) {
                        aumento = 10;
                    } else {
                        aumento = 0;
                    }
                    numeroMayor = numero + aumento;
                }

                if (numero < numeroMenor || numeroMenor == 0) {

                    //se pregunta si el numero mayor es menor a 50 y si i es diferente a 4 ya que en ese caso es la primera 
                    //vez que ha entrado al ciclo for si se cumple esto se le resta 5 al numeroMenor sino 0 osea no afecta en nada
                    if (numeroMayor < 50 && i != 4) {
                        decremento = 5;
                    } else{
                        decremento = 0;
                    }

                    numeroMenor = numero - decremento;
                }
            }
            //ya evito el codigo de arriba si dio 200 como suma vuelvo a dejar la variable booleana como false para que ejecute el codigo de arriba
            dioDocientos = false;
        }

        System.out.println("-------------RESULTADOS---------------");
        System.out.println("Numero Mayor: " + numeroMayor);
        System.out.println("Numero Menor: " + numeroMenor);
    }

}

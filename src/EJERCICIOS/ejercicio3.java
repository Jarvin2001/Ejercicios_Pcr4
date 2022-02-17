package EJERCICIOS;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        int numeroEmpleados;
        //arreglo donde se almacenaran los sueldos
        double[] sueldos;
        //sueldo ingresado que se ira evaluando si no es negativo
        double sueldoIngresado;
        
        //declaramos el escaner y capturamos para cuantos empleados se digitaran los sueldos
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de empleados a ingresar sueldos: ");
        numeroEmpleados = leer.nextInt();
        //ya sabemos cuantos empleados digito el usuario por lo tanto ya podemos decirle de cuantos espacios necesitamos el 
        //arreglo de esta manera new double[numeroEmpleados] si ahi el usuario digito 5 entonces le decimos el arreglo tendra
        //5 espacios disponibles para almacenar informacion empezando del indice 0 al 4
        sueldos = new double[numeroEmpleados];

        //comienza el ciclo for por la cantidad ingresada de empleados dara una vuelta pidiendo el sueldo de cada uno y evaluando
        //que no se cantidad negativa
        for (int i = 0; i < numeroEmpleados; i++) {
            //se solicita el sueldo + (i + 1) + en esta parte i viene con valor 0 por eso le sumo 1 para que aparezca empleado 1
            System.out.println("Ingrese sueldo de empleado " + (i + 1) + ": ");
            //capturo el sueldo ingresado en la variable sueldoIngresado
            sueldoIngresado = leer.nextDouble();
            
            //pregunto si el sueldo ingresado es menor a 0 es porque es negativo ingresara aqui
            if (sueldoIngresado < 0) {
                //la estructura do ingresa la primera vez ejecuta el codigo interno y cuando llega al while verifica si lo
                //que esta en parentesis es verdadero vuelve al inicio a preguntar lo mismo y ahi estara dando vueltas hasta
                //que se ingrese una cantidad positiva ya que aca (sueldoIngresado < 0) le estoy diciendo que mientras el sueldo
                //ingresado sea < 0 siga enviando el mensaje y solicitando el sueldo
                do {
                    System.out.println("No se permiten valores negativos ingrese de nuevo el sueldo: ");
                    sueldoIngresado = leer.nextDouble();
                } while (sueldoIngresado < 0);
            }
            //ya habiendo pasado el filtro de arriba guardo el valor positivo en sueldos en la posicion i es decir en la 0 y asi
            //ira almacenando cada sueldo en las posiciones de acuerdo al tamaño del arreglo
            sueldos[i] = sueldoIngresado;
        }

        int contador = 1;
        //para verificar que todos los sueldos van correctamente imprimo en pantalla con sueldos.length puedo saber el tamaño 
        //que tiene este arreglo y asi recorrer cada valor con la estructura for
        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("sueldo empleado " + contador + ": " + sueldos[i]);
        }
    }

}

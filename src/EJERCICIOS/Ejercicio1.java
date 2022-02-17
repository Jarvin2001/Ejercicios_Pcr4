package EJERCICIOS;

//importando libreria para poder usar el escaner y capturar lo que digita el usuario
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        double nota = 0.00;
        //para poder capturar informacion ingresada por el usuario se define una variable de tipo Scanner
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la nota del estudiante: ");
        nota = leer.nextDouble();
        
        // comienza la estructura if pregunta si es mayor o igual a 7 caso contrario pregunta si esta ente 6.50 o 6.99 sino esta reprobado
        if (nota >= 7) {
            System.out.println("Usted esta Aprobado!");
        } else if (nota >= 6.50 && nota <= 6.99) {
            System.out.println("Usted aplica para un examen de suficiencia para aprobar ya que su nota es: "+ nota);
        } else {
            System.out.println("Usted esta Reprobado!");
        }
    }
    
}

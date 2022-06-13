/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.*;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        /*
        En el método **main**, se debe permitir ingresar objetos 
        de tipo Estudiante Distancia y Estudiante Presencial. 
        Uno a la vez. Si el usuario ingresa 1, se debe crear un 
        Estudiante Distancia por teclado; si ingresa 2, se debe crear un 
        Estudiante Presencial. Los datos de entrada serán ingresados por 
        teclado.

        Restricciones:
        * En el código solo debe usar por una sola ocasión la siguiente 
        sentencias
        ```
            nombres = entrada.nextLine()
            apellidos = entrada.nexLine()
            cedula = entrada.nextLine()
            edad = entrada.nextInt()
        ```
        * Si el usuario ingresa algo diferente de 1 o 2; el programa debe 
        presentar un mensaje que diga: "Error, opción no válida."
        
         */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int op;

        System.out.println("Ingrese 1 si es Estudiante a Distancia"
                + "\nIngrese 2 si es Estudiante Presencial");
        op = entrada.nextInt();
        entrada.nextLine();
        if (op == 1 || op == 2) {
            System.out.println("Ingrese el nombre del estudiante");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese el apellido del estudiante");
            String apellido = entrada.nextLine();
            System.out.println("Ingrese la identificacion del estudiante");
            String identificacion = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            int edad = entrada.nextInt();

            switch (op) {

                case 1:
                    System.out.println("Ingrese el numero de asignaturas del estudiante");
                    int numA = entrada.nextInt();
                    System.out.println("Ingrese el costo de las asignaturas del estudiante");
                    double costoA = entrada.nextDouble();
                    EstudianteDistancia estudiante = new EstudianteDistancia();
                    estudiante.establecerNombresEstudiante(nombre);
                    estudiante.establecerApellidoEstudiante(apellido);
                    estudiante.establecerIdentificacionEstudiante(identificacion);
                    estudiante.establecerEdadEstudiante(edad);
                    estudiante.establecerNumeroAsginaturas(numA);
                    estudiante.establecerCostoAsignatura(costoA);
                    estudiante.calcularMatriculaDistancia();
                    System.out.printf("%s\n", estudiante);
                    break;

                case 2:

                    System.out.println("Ingrese el numero de creditos del estudiante");
                    int numC = entrada.nextInt();
                    System.out.println("Ingrese el costo del credito del estudiante");
                    double costoC = entrada.nextDouble();
                    EstudiantePresencial estudiante1 = new EstudiantePresencial();
                    estudiante1.establecerNombresEstudiante(nombre);
                    estudiante1.establecerApellidoEstudiante(apellido);
                    estudiante1.establecerIdentificacionEstudiante(identificacion);
                    estudiante1.establecerEdadEstudiante(edad);
                    estudiante1.establecerNumeroCreditos(numC);
                    estudiante1.establecerCostoCredito(costoC);
                    estudiante1.calcularMatriculaPresencial();
                    System.out.printf("%s\n", estudiante1);
                    break;

            }
        } else {
            System.out.println("Opcion no valida");
        }

    }
}

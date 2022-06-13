/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;
import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        //1. Crear un objeto de tipo Estudiante Presencial
        //Ingresar los datos por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        
        EstudiantePresencial estudiante = new EstudiantePresencial();
        System.out.println("Ingrese el nombre del estudiante");
        String nombre= entrada.nextLine();
        System.out.println("Ingrese el apellido del estudiante");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese la identificacion del estudiante");
        String identificacion = entrada.nextLine();
        System.out.println("Ingrese la edad del estudiante");
        int edad= entrada.nextInt();
        System.out.println("Ingrese el numero de creditos del estudiante");
        int numC = entrada.nextInt();
        System.out.println("Ingrese el costo del credito del estudiante");
        double costoC= entrada.nextDouble();
        
        estudiante.establecerNombresEstudiante(nombre);
        estudiante.establecerApellidoEstudiante(apellido);
        estudiante.establecerIdentificacionEstudiante(identificacion);
        estudiante.establecerEdadEstudiante(edad);
        estudiante.establecerNumeroCreditos(numC);
        estudiante.establecerCostoCredito(costoC);
        estudiante.calcularMatriculaPresencial();
        
        System.out.printf("%s\n", estudiante);
        
    }
    
}

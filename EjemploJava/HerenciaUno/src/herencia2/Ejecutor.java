/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;
import herencia1.*;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    public static void main(String[] args) {
        
        //1. Crear un objeto de tipo Estudiante a Distancia
        EstudianteDistancia estudiante = new EstudianteDistancia();
        estudiante.establecerNombresEstudiante("Tais");
        estudiante.establecerApellidoEstudiante("Balcázar");
        estudiante.establecerIdentificacionEstudiante("1150083242");
        estudiante.establecerEdadEstudiante(18);
        estudiante.establecerCostoAsignatura(30);
        estudiante.establecerNumeroAsginaturas(5);
        estudiante.calcularMatriculaDistancia();
        /*
        System.out.printf("%s (%.2f)\n",
                estudiante.obtenerApellidoEstudiante(),
                estudiante.obtenerMatriculaDistancia());
        */
        System.out.printf("%s\n",estudiante);

    }

}

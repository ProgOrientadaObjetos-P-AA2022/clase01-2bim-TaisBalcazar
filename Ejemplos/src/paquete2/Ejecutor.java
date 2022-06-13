/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("Edificio Central");
        edf1.establecerCostos(20000);
        Edificio edf2 = new Edificio("Edificio Norte");
        edf2.establecerCostos(30000);
        Edificio edf3 = new Edificio("Edificio Sur");
        edf3.establecerCostos(10000);
        Edificio edf4 = new Edificio("Edificio Secundario");
        edf4.establecerCostos(5000);

        Edificio[] edificios = {edf1, edf2, edf3, edf4};

        Vehiculo v1 = new Vehiculo("Auto", "LBB0011", 10000);
        Vehiculo v2 = new Vehiculo("Camioneta", "LCB0011", 20000);
        Vehiculo v3 = new Vehiculo("Auto", "LBD0012", 6000);
        Vehiculo v4 = new Vehiculo("Camioneta", "LCC0011", 10000);
        Vehiculo v5 = new Vehiculo("Camioneta", "LDC0011", 25000);

        Vehiculo[] vehiculos = {v1, v2, v3, v4, v5};

        /*Es lo mismo que hacer esto 
        Edificio[] edificios = new Edificio[4];
        edificios[0] = edf1;
        edificios[1] = edf2;
        edificios[2] = edf3;
        edificios[3] = edf4;
         */
        Empresa miempresa = new Empresa();
        miempresa.establecerNombre("Empresa de Hojas");
        miempresa.establecerEdificios(edificios);
        miempresa.establecerVehiculos(vehiculos);
        miempresa.establecerCostoBienesInmuebles();
        miempresa.establecerCostoVehiculos();
        miempresa.establecerCostoTotalBienes();

        // Imprimir el costo de los bienes inmuebles de la empresa
        //System.out.printf("%.2f\n", miempresa.obtenerCostoBienesInmuebles());
        System.out.println(miempresa);

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author santi
 */
public class Apartaestudio extends Apartamento{
    protected static double valorArea = 1500000;
    public Apartaestudio(int identificadorInmobiliario, int area, String direccion,
            int numeroHabitaciones, int numeroBaños){
        super(identificadorInmobiliario, area, direccion, 1, 1);
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("");
    }
}
/** esto no  hace nada **/
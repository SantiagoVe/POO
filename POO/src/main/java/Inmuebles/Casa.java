/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author santi
 */
public class Casa extends InmuebleVivienda{
    protected int numeroPisos;
    
    public Casa(int identificadorInmobiliario, int area, String direccion,
            int numeroHabitaciones, int numeroBaños, int numeroPisos){
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        this.numeroPisos = numeroPisos;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Numero de pisos = "+ numeroPisos);
    }
}
/** esto no  hace nada **/
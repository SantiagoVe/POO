/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author santi
 */
public class Apartamento extends InmuebleVivienda {
    
public Apartamento(int identificadorInmobiliario, int area, String
direccion, int numeroHabitaciones, int numeroBaños) {
// Invoca al constructor de la clase padre
super(identificadorInmobiliario, area, direccion,
numeroHabitaciones, numeroBaños);
}
public void imprimir() {
super.imprimir(); 
}
}

/** esto no  hace nada **/
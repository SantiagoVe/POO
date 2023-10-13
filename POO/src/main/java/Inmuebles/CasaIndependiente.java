/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author santi
 */
public class CasaIndependiente extends CasaUrbana{
    protected static double valorArea = 3000000;
    public CasaIndependiente(int identificadorInmobiliario, int area,
    String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos) {
    super(identificadorInmobiliario, area, direccion,
numeroHabitaciones, numeroBaños, numeroPisos);
     }
    public void imprimir() {
    super.imprimir();
        }
    }

/** esto no  hace nada **/
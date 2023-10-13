/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author santi
 */
public class ApartamentoFamiliar extends Apartamento {
    protected static double valorArea = 2000000;
    protected int valorAdministracion;

    public ApartamentoFamiliar(int identificadorInmobiliario, int area,
    String direccion, int numeroHabitaciones, int numeroBaños, int valorAdministracio){
    super(identificadorInmobiliario, area, direccion,
    numeroHabitaciones, numeroBaños);
    this.valorAdministracion = valorAdministracion;
    }
    public void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println("Valor de la administración = $" +
    valorAdministracion);
    System.out.println();
        }
    }
/** esto no  hace nada **/

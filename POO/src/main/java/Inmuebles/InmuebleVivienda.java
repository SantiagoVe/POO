package Inmuebles;

public class InmuebleVivienda extends Inmueble{
    protected int numeroHabitaciones;
    protected int numeroBaños;
    
   public InmuebleVivienda(int identificadorInmobiliario, int area, String
direccion, int numeroHabitaciones, int numeroBaños) {
super(identificadorInmobiliario, area, direccion); /* Invoca al
constructor de la clase padre */
this.numeroHabitaciones = numeroHabitaciones;
this.numeroBaños = numeroBaños;
    }

    /**
     *
     */
    public void imprimir(){
        super.imprimir();
        System.out.println("Numero de habitaciones = "+ numeroHabitaciones);
        System.out.println("NUmero de baños = "+ numeroBaños);
    }
}
/** esto no  hace nada **/
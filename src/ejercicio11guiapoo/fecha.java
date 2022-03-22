/*
11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
Scanner leer = new Scanner(System.in);
 */
package ejercicio11guiapoo;

import java.util.Date;

public class fecha {

    private Date fecha; // Atributo tipo Date

    public fecha() {
        fecha = new Date();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void llenarFecha(Date fecha) {

        this.fecha = fecha; // Lo guardamos en el atributo

    }

    public void mostrarFecha() {

        System.out.println("Dia:" + fecha.getDate() // Mostramos el dia con getDate, no con getDay
                + " Mes:" + fecha.getMonth() // Mostramos el mes 
                + " Año:" + fecha.getYear()); // Mostramos el año

    }

    @Override
    public String toString() {
        return "Dia:" + fecha.getDate() // Mostramos el dia con getDate, no con getDay
                + " Mes:" + fecha.getMonth() // Mostramos el mes 
                + " Año:" + fecha.getYear();
    }

}

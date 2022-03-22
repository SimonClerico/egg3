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
import java.util.Scanner;

public class Ejercicio11GuiaPoo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        fecha l2 = new fecha();
        

        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();
        
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        
        System.out.println("Ingrese el ano");
        int ano = leer.nextInt();
        
        Date l1 = new Date();
        Date fechaActual = new Date();
        l1.setDate(dia);
        l1.setDate(mes);
        l1.setDate(ano);
        
        l2.llenarFecha(l1);
        l2.mostrarFecha();
        
        
    }

}

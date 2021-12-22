/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.
 */
package D.Baja;

import java.util.Locale;
import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.print("Ingrese su nombre: ");
        String nombre = leer.next();
        System.out.print("Su nombre es: " + nombre);
    
        
    }

}

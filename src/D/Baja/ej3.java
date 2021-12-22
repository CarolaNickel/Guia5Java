/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.
 */
package D.Baja;

import java.util.Locale;
import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.print("Ingrese una frase: ");
        String frase = leer.next();
        
        System.out.println("La frase ingresada en mayuscula, " + frase.toUpperCase());
        System.out.println("La frase ingresada en minuscula, " + frase.toLowerCase());
      
    }

}

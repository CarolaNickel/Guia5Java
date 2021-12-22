/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
 */
package D.Baja;

import java.util.Locale;
import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese un numero entero ");
        int entero = leer.nextInt();
        System.out.println("Ingrese otro numero entero");
        int entero1 = leer.nextInt();

        System.out.println("La suma de los numeros ingresados es de " + (entero + entero1));
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conteodenumeros;

import java.util.Scanner;

/**
 *
 * @author jcplo
 */
public class Conteodenumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingresar números: ");
    int cantidaddenumeros = scanner.nextInt();
    int mayoresque0 = 0;
    int menoresque0 = 0;
    int igualesque0 = 0;
    for (int i = 0; i < cantidaddenumeros; i++) {
    System.out.print("Ingrese el número " + (i + 1) + ": ");
    int numero = scanner.nextInt();
    if (numero > 0) {
    mayoresque0++;
    } else if (numero < 0) {
    menoresque0++;
    } else {
    igualesque0++;
    }
   }
        System.out.println("Números mayores a 0: " + mayoresque0);
        System.out.println("Números menores a 0: " + menoresque0);
        System.out.println("Números iguales a 0: " + igualesque0);
    }
    
}

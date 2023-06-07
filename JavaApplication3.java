/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author Pablo Benavides
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de filas del triangulo: ");
        int numFilas = sc.nextInt();
        
        for (int i = 1; i <= numFilas; i++) {
            // Dibuja los espacios en blanco antes de los asteriscos
            for (int j = 1; j <= numFilas - i; j++) {
                System.out.print(" ");
            }
            
            // Dibuja los asteriscos en cada fila
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            
            // Cambia de línea después de cada fila
            System.out.println();
        }
    }
    
}

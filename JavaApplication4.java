/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Pablo Benavides
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 System.out.println("Valores entre 20 y 30 y su correspondiente valor al cuadrado:");
        
        for (int i = 20; i <= 30; i++) {
            int cuadrado = i * i;
            System.out.println(i + " al cuadrado = " + cuadrado);
        }
    }
    
}

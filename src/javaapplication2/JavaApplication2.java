/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author LABORATORIO 04
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner scanner = new Scanner(System.in);

System.out.print("Ingrese un numero:");
int numero= scanner.nextInt();

System.out.println("Tabla de multiplicar del "  + numero + ":");
 for (int i=1; i<=10; i++){
      int resultado = numero * i;
      System.out.println(numero + "x"+ i + "=" + resultado);
      }
    }
    
}

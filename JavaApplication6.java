/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;
import java.util.Scanner;
/**
 *
 * @author Pablo Benavides
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner scanner = new Scanner(System.in);

        int sumaNotas = 0;
        int notaMaxima = Integer.MIN_VALUE;
        int notaMinima = Integer.MAX_VALUE;
        int estudiantesAprobados = 0;
        int contadorEstudiantes = 0;

        System.out.println("Ingrese las notas de los estudiantes (Ingrese una nota negativa para terminar):");
        while (true) {
            System.out.print("Ingrese la nota: ");
            int nota = scanner.nextInt();

            if (nota < 0) {
                break;
            }

            contadorEstudiantes++;
            sumaNotas += nota;

            if (nota > notaMaxima) {
                notaMaxima = nota;
            }

            if (nota < notaMinima) {
                notaMinima = nota;
            }

            if (nota >= 70) {
                estudiantesAprobados++;
            }
        }

        if (contadorEstudiantes == 0) {
            System.out.println("No se ingresaron notas de estudiantes.");
        } else {
            double promedio = (double) sumaNotas / contadorEstudiantes;

            System.out.println();
            System.out.println("----- Resultados -----");
            System.out.println("Promedio de notas: " + promedio);
            System.out.println("Nota maxima: " + notaMaxima);
            System.out.println("Nota minima: " + notaMinima);
            System.out.println("Cantidad de estudiantes aprobados: " + estudiantesAprobados);
        }

        scanner.close();
    }
    
}

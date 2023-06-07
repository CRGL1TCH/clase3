/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;
import java.util.Scanner;
/**
 *
 * @author Pablo Benavides
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = scanner.nextInt();
        System.out.println();

        int sumaNotas = 0;
        int notaMaxima = Integer.MIN_VALUE;
        int notaMinima = Integer.MAX_VALUE;
        int estudiantesAprobados = 0;

        for (int i = 1; i <= cantidadEstudiantes; i++) {
            System.out.print("Ingrese la nota del estudiante " + i + ": ");
            int nota = scanner.nextInt();

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

        double promedio = (double) sumaNotas / cantidadEstudiantes;

        System.out.println();
        System.out.println("----- Resultados -----");
        System.out.println("Promedio de notas: " + promedio);
        System.out.println("Nota maxima: " + notaMaxima);
        System.out.println("Nota minima: " + notaMinima);
        System.out.println("Cantidad de estudiantes aprobados: " + estudiantesAprobados);

        scanner.close();
    }
    
}

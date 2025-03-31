/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmos;

import static Algoritmos.Ordenamientos.ordenamientoBurbuja;
import static Algoritmos.Ordenamientos.ordenamientoInsercion;
import static Algoritmos.Ordenamientos.ordenamientoSeleccion;

/**
 * Clase principal para ejecutar cada método.
 * @author luismorellb
 */
public class Main {
    
    public static void main(String[] args) {
        
        // Ordenamiento Burbuja
        int[] arr = {10, 6, 2, 11, 5, 14}; // O(n)
        ordenamientoBurbuja(arr); // O(n^2)
        System.out.println("Arreglo ordenado:");
        for (int num : arr) { // O(n)
            System.out.print(num + " ");
        }
        
        // Ordenamiento Selección
        int[] arr2 = {44, 66, 18, 20, 42}; // O(n)
        ordenamientoSeleccion(arr2); // O(n^2)
        System.out.println("Arreglo ordenado (Selección):");
        for (int num : arr2) { // O(n)
            System.out.print(num + " ");
        }
        
        //Ordenamiento Inserción
        int[] arr3 = {34, 10, 4, 45, 5, 25}; // O(n)
        ordenamientoInsercion(arr3); // O(n^2)
        System.out.println("Arreglo ordenado (Inserción):");
        for (int num : arr3) { // O(n)
            System.out.println(num + " ");
        }
        
        //Ordenamiento Rápido
        int[] arr4 = {18, 3, 20, 31, 4, 15}; // O(n)
        Ordenamientos ordenamiento = new Ordenamientos();
        
        ordenamiento.ordenamientoRapido(arr4, 0, arr4.length - 1); // O(n log n)
        
        System.out.println("Arreglo ordenado (Rápido):");
        for (int num : arr4) { // O(n)
            System.out.println(num + " ");     
        }
        
        // Ordenamiento Mezcla
        int[] arr5 = {20, 10, 40, 90, 80, 30}; // O(n)

        ordenamiento.ordenamientoMezcla(arr5, 0, arr5.length - 1); // O(n log n)

        System.out.println("Arreglo ordenado (Mezcla):");
        for (int num : arr5) { // O(n)
            System.out.println(num + " ");
        }
    }
}
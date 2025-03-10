/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmos;

import static Algoritmos.Ordenamientos.ordenamientoBurbuja;
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
    }
}
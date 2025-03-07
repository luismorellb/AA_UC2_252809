/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmos;

import static Algoritmos.Ordenamientos.ordenamientoBurbuja;

/**
 * Clase principal para ejecutar cada método.
 * @author luismorellb
 */
public class Main {
    
    public static void main(String[] args) {
        int[] arr = {10, 6, 2, 11, 5, 14}; // O(n)
        ordenamientoBurbuja(arr); // O(n^2)
        System.out.println("Arreglo ordenado:");
        for (int num : arr) { // O(n)
            System.out.print(num + " ");
        }
    }
}
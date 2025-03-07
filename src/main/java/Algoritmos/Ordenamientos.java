/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmos;

/**
 * Clase con todos los métodos de ordenamiento.
 * @author luismorellb
 */
public class Ordenamientos {
    
    public static void ordenamientoBurbuja(int[] arr) { // O(n^2)
        int n = arr.length; // 1 
        for (int i = 0; i < n - 1; i++) { // 1 + n + (n-1) 
            for (int j = 0; j < n - 1 - i; j++) { // (n-1)n
                if (arr[j] > arr[j + 1]) { // (n-1)n
                    // Esta sección funciona para el intercambio de elementos
                    int temp = arr[j]; // 1
                    arr[j] = arr[j + 1]; // 1 
                    arr[j + 1] = temp; // 1 
                }
            }
        }
    }
    
    /**
     * Expresión algebraica: 6n^2 - 4n + 1
     */
    
    /** 
     * Complejidad temporal: Cuadrática O(n^2)
     * La complejidad es cuadrática debido a que el primer ciclo for se ejecuta n veces, mientras que el otro ciclo for 
     * que está dentro del primero se ejecuta n-1 veces dependiendo de la iteración del primero.
     * En pocas palabras, el tiempo de ejecución crece exponencialmente con el aumento del tamaño del arreglo (que es n).
     */ 
}
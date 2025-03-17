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
    
    /**
     * Método que ordena un arreglo de números enteros utilizando el algoritmo de 
     * Ordenamiento por Selección.
     * 
     * @param arr2 El arreglo de números que se va a ordenar.
     */
    
    public static void ordenamientoSeleccion(int[] arr2) { // O(n^2)
        int n = arr2.length; // 1
        for (int i = 0; i < n - 1; i++) { // 1 + n + 1 + n
            int min = i; // n
            for (int j = i + 1; j < n; j++) // n(n-1)
                if (arr2[j] < arr2[min]) // n(n-1)
                    min = j; // n(n-1)
            // Esta sección funciona para el intercambio de elementos
            int temp = arr2[i]; // 1
            arr2[i] = arr2[min]; // 1
            arr2[min] = temp; // 1
        }
    }
    
    /**
     * Expresión algebraica: n^2 + 3n + 6
     */
    
    /** 
     * Complejidad temporal: Cuadrática O(n^2)
     * Igual que el método anterior, este también es cuadrático ya que como se puede observar en los ciclos for,
     * el bucle interno se ejecuta n veces para cada iteración del bucle externo.
     * Entonces, como ya se mencionó, el tiempo de ejecución crece exponencialmente con el aumento del tamaño del arreglo (que es n).
     */ 
    
    /**
     * Método que ordena un arreglo de números enteros utilizando el algoritmo de
     * Ordenamiento de Inserción.
     * 
     * @param arr3 El arreglo de números que se va a ordenar. 
     */
    
    public static void ordenamientoInsercion(int[] arr3) { // O(n^2)
        int n = arr3.length; // 1
        
        for(int i = 1; i < n; i++){ // 1 + n + 1 + n
            int key = arr3[i]; // n-1
            int j = i - 1; // n-1
            
            while (j >= 0 && arr3[j] > key){ // n(n-1)
                arr3[j+1] = arr3[j]; // n(n-1)
                j = j - 1; // n(n-1)
            }
            arr3[j+1] = key; // n-1
        }
    }
    
    /**
     * Expresión algebraica: n^2 + 3n - 3
     */
    
    /** 
     * Complejidad temporal: Cuadrática O(n^2)
     * Es cuadrático ya que como se puede observar en los ciclos for y while,
     * el bucle interno (while) se ejecuta hasta i veces para cada iteración del bucle externo (for).
     * Por lo que, como ya se mencionó, el tiempo de ejecución crece exponencialmente con el aumento del tamaño del arreglo (que es n).
     */ 
}
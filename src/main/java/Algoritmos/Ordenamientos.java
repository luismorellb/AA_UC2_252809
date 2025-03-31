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
    
    /**
     * Método que ordena un arreglo de números enteros utilizando el algoritmo de
     * Ordenamiento Rápido.
     * 
     * @param inicio Índice inicial del subarreglo a ordenar.
     * @param fin Índice final del subarreglo a ordenar.
     * @param arr4 El arreglo de números que se va a ordenar. 
     */
    
    // Método para ejecutar el QuickSort
    public void ordenamientoRapido(int[] arr4, int inicio, int fin) {
        if (inicio < fin) { // 1
            int indiceParticion = particion(arr4, inicio, fin); // n
            ordenamientoRapido(arr4, inicio, indiceParticion - 1); // T(n/2)
            ordenamientoRapido(arr4, indiceParticion + 1, fin); // T(n/2)
        }
    }

    // Método para realizar la partición del array
    private int particion(int[] arr4, int inicio, int fin) {
        int pivote = arr4[fin]; // 1
        int i = inicio - 1; // 1
        for (int j = inicio; j < fin; j++) { // 1 + n + 1 + n
            if (arr4[j] <= pivote) { // 1
                i++; // 1
                intercambiar(arr4, i, j); // 1
            }
        }
        intercambiar(arr4, i + 1, fin); // 1
        return i + 1; // 1
    }

    // Método para intercambiar dos elementos en un array
    private void intercambiar(int[] arr4, int i, int j) {
        int temp = arr4[i]; // 1
        arr4[i] = arr4[j]; // 1
        arr4[j] = temp; // 1
    }
    
    /**
     * Expresión algebraica: 2T(n/2) + n
     */
    
    /** 
     * Complejidad temporal: En el mejor caso, logarítmica: O(n log n); Por el contrario, de ser el peor caso, cuadrática: O(n^2)
     * Mejor caso: O(n log n), cuando el pivote divide el array en dos partes iguales en cada nivel de la recursión,
     * reduciendo el tamaño del problema a la mitad en cada paso.
     * Peor caso: O(n^2), cuando el pivote siempre es el elemento más grande o más pequeño,
     * lo que provoca que solo un lado del array tenga elementos y el otro quede vacío.
     */ 
    
    /**
     * Método que ordena un arreglo de números enteros utilizando el algoritmo de
     * Ordenamiento Mezcla.
     * 
     * @param arr5 El arreglo de números que se va a ordenar. 
     * @param l Representa el índice del primer elemento del subarreglo que se está considerando ordenar.
     * @param r Representa el índice del último elemento del subarreglo que se está considerando ordenar.
     */
    
    public void ordenamientoMezcla(int arr5[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2; // O(1)

            ordenamientoMezcla(arr5, l, m);
            ordenamientoMezcla(arr5, m + 1, r);
            mezcla(arr5, l, m, r);
        }
    }
    
    private void mezcla(int arr[], int l, int m, int r) {
        int n1 = m - l + 1; // O(1)
        int n2 = r - m;     // O(1)

        int L[] = new int[n1]; // O(n1)
        int R[] = new int[n2]; // O(n2)

        for (int i = 0; i < n1; i++)  // O(n1)
            L[i] = arr[l + i];  // O(1) por cada iteración

        for (int j = 0; j < n2; j++)  // O(n2)
            R[j] = arr[m + 1 + j];  // O(1) por cada iteración

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {  // O(n1 + n2)
            if (L[i] <= R[j]) {
                arr[k] = L[i];  // O(1)
                i++;
            } else {
                arr[k] = R[j];  // O(1)
                j++;
            }
            k++;  // O(1)
        }

        while (i < n1) {  // O(n1)
            arr[k] = L[i];  // O(1)
            i++;
            k++;
        }

        while (j < n2) {  // O(n2)
            arr[k] = R[j];  // O(1)
            j++;
            k++;
        }
    }
    
    /**
     * Expresión algebraica: 2T(n/2) + O(n)
     */
    
    /** 
     * Complejidad temporal: En el mejor y peor caso, logarítmica: O(n log n).
     * El algoritmo siempre tiene una complejidad de O(n log n), 
     * ya que el arreglo se divide recursivamente en dos subarreglos en cada paso 
     * y la fusión de los subarreglos toma O(n) tiempo en cada nivel de recursión.
     */
}
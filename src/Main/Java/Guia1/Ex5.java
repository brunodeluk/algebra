package Guia1;

/**
 * Dado un conjunto de números enteros verificar si un número dado pertenece al conjunto.
 * @author Nicolas Curat, Bruno De Luca
 */

public class Ex5 {
    //Iterative
    //I use sequential search.
    private static boolean search(int a, int[] array){
        for (int anArray : array) {
            if (anArray == a) return true;
        }
        return false;
    }
    //Recursive
    private static boolean recursiveSearch(int a, int[] array) {
        return recursiveSearch(0, a, array);
    }

    private static boolean recursiveSearch(int index, int a, int[] array) {
        return array[index] == a || index != array.length - 1 && recursiveSearch(index + 1, a, array);
    }
}

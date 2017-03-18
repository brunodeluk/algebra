package Guia1;

/**
 * Determinar la cantidad de ceros que tienen un número natural. Por ejemplo si n = 93020, la respuesta es 2
 * @author Nicolas Curat, Bruno De Luca
 */

public class Ex3 {

    /**
     * Algoritmo iterativo que cuenta la cantidad de ceros de un numero
     * @param n numero inicial
     * @return numero de ceros
     */

    public int countCerosIterative(int n){
        int check = n;
        int count = 0;
        while((n - check) != n){
            if((check % 10) == 0) count++;
            check = check / 10;
        }
        return count;
    }

    /**
     * Algoritmo recursivo que cuenta la cantidad de ceros de un numero
     * @param n valor inicial
     * @return numeo de ceros
     */

    public int countCerosRecursive(int n){
        return countCerosRecursive(n, n, 0);
    }

    private int countCerosRecursive(int n, int check, int count){
        if((n - check) == n) return count;
        if((check % 10) == 0) count++;
        return countCerosRecursive(n, check / 10, count);
    }

}

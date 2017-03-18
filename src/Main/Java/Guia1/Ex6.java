package Guia1;

/**
 * Escribe algoritmos para:
 * i) Determinar si un entero positivo, n, es primo.
 * ii) Dado un número entero hallar el primer número primo mayor o igual al número dado.
 * iii) Determinar la cantidad de factores primos que tiene un número entero.
 * iv) Determinar los factores primos que tiene un número entero.
 * @author Nicolas Curat, Bruno De Luca
 */

public class Ex6 {

    /**
     * Metodo iterativo que verifica si un numero es primo
     * @param n
     * @return boolean
     */

    public boolean isPrime(int n){
        double sqrt = Math.sqrt(n);
        for(int i = 2; i <= sqrt; i++){
            if((n % i) == 0) return false;
        }
        return true;
    }

    /**
     * Metodo recursivo que verifica si un numero es primo
     * @param n
     * @return boolean
     */

    public boolean isPrimeRecursive(int n){
        double sqrt = Math.sqrt(n);
        return isPrimeRecursive(n,2, sqrt);
    }

    private boolean isPrimeRecursive(int n, int i, double sqrt) {
        return i > sqrt || (n % i) != 0 && isPrimeRecursive(n, i + 1, sqrt);
    }

    /**
     * Metodo iterativo que devuelve el primer numero primo mayor o igual al dado
     * @param n
     * @return
     */

    public int findFirstPrimeNumber(int n){
        int result = n;
        while(!isPrime(result)){
            result++;
        }
        return result;
    }

    /**
     * Metodo recursivo que devuelve el primer numero primo mayor o igual al dado
     * @param n
     * @return
     */

    public int findFirstPrimeNumberRecursive(int n) {
        if(isPrime(n)) return n;
        return findFirstPrimeNumberRecursive(n + 1);
    }

    /**
     * Metodo iterativo que devuelve la cantidad de factores primos
     * @param n
     * @return
     */

    public int countPrimeNumbers(int n){
        int count = 0;
        for(int i = 2; i <= n; i++){
            if(((n % i) == 0) && isPrime(i)) count++;
        }
        return count;
    }

    /**
     * Metodo recursivo que devuelve la cantidad de factores primos
     * @param n
     * @return
     */

    public int countPrimeNumbersRecursive(int n){
        return countPrimeNumbersRecursive(n, 0, 2);
    }

    private int countPrimeNumbersRecursive(int n, int count, int i){
        if(i > n) return count;
        if(((n % i) == 0) && isPrime(i)) ++count;
        return countPrimeNumbersRecursive(n, count, i+1);
    }

    /**
     * Metodo iterativo que devuelve un array con los factores primos
     * @param n
     * @return
     */

    public int[] returnPrimeNumbers(int n) {
        int[] result = new int[countPrimeNumbers(n)];
        int j = 0;
        for(int i = 2; i <= n; i++){
            if(((n % i) == 0) && isPrime(i)) result[j++] = i;
        }
        return result;
    }

    /**
     * Metodo recursivo que devuelve un array con los factores primos
     * @param n
     * @return
     */

    public int[] returnPrimeNumbersRecursive(int n){
        int[] result = new int[countPrimeNumbers(n)];
        return returnPrimeNumbersRecursive(n,result,2,0);
    }

    private int[] returnPrimeNumbersRecursive(int n, int[] result, int i, int j){
        if(i > n) return result;
        if(((n % i) == 0) && isPrime(i)) result[j++] = i;
        return returnPrimeNumbersRecursive(n, result, i+1, j);
    }




}

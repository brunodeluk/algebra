package Guia1;

/**
 * Esta clase prove metodos para resolver sumatorias
 * @author Nicolas Curat, Bruno De Luca
 */

public class Ex1 {

    /**
     * Metodo iterativo para resolver la sumatoria  1 + 2 + 3 + ... + n
     * @param n valor
     * @return sumatoria hasta n
     */

    public int sumA(int n){
        int sum = 0;
        int i = 0;
        while(i <= n){
            sum += i;
            i++;
        }
        return sum;
    }

    /**
     * Metodo recursivo para resolver la sumatoria  1 + 2 + 3 + ... + n
     * @param n valor
     * @return sumatoria hasta n
     */

    public int sumAR(int n){
        int sum;
        if(n == 0) return 0;
        sum = sumAR(n-1) + n;
        return sum;
    }

    /**
     * Metodo iterativo para resolver la sumatoria  n^2
     * @param n valor
     * @return sumatoria hasta n
     */

    public int sumB(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    /**
     * Metodo recursivo para resolver la sumatoria  n^2
     * @param n valor
     * @return sumatoria hasta n
     */

    public int sumBR(int n){
        int sum;
        if(n == 0) return 0;
        sum = sumBR(n-1) + (int)Math.pow(n, 2);
        return sum;
    }

    /**
     * Metodo iterativo para resolver la sumatoria  p^n
     * @param n valor
     * @param p base
     * @return sumatoria hasta n
     */

    public int sumC(int p, int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(p, i);
        }
        return sum;
    }

    /**
     * Metodo recursivo para resolver la sumatoria  p^n
     * @param n valor
     * @param p base
     * @return sumatoria hasta n
     */

    public int sumCR(int p, int n){
        int sum;
        if(n == 0) return 1;
        sum = sumCR(p, n-1) + (int)Math.pow(p, n);
        return sum;
    }

    /**
     * Metodo iterativo para resolver la sumatoria  2n - 1
     * @param n valor
     * @return sumatoria hasta n
     */

    public int sumD(int n){
        int sum = 0;
        int index = 1;
        while(index <= n){
            sum += (2*index)-1;
            index++;
        }
        return sum;
    }

    /**
     * Metodo recursivo para resolver la sumatoria  2n - 1
     * @param n valor
     * @return sumatoria hasta n
     */

    public int sumDR(int n){
        int sum;
        if(n == 0) return 0;
        sum = sumDR(n-1) + (2*n - 1);
        return sum;
    }


    /**
     * Metodo iterativo para resolver la sumatoria  n * (n - 1)
     * @param n valor
     * @return sumatoria hasta n
     */

    public int sumE(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i*(i+1);
        }
        return sum;
    }

    /**
     * Metodo recursivo para resolver la sumatoria  n * (n - 1)
     * @param n valor
     * @return sumatoria hasta n
     */

    public int sumER(int n){
        int sum;
        if(n == 0) return 0;
        sum = sumER(n-1) + (n*(n+1));
        return sum;
    }

    /**
     * Metodo iterativo para resolver la sumatoria  n^3
     * @param n valor
     * @return sumatoria hasta n
     */

    public int sumF(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (int)Math.pow(i, 3);
        }
        return sum;
    }

    /**
     * Metodo recursivo para resolver la sumatoria  n^3
     * @param n valor
     * @return sumatoria hasta n
     */

    public int sumFR(int n){
        int sum;
        if(n == 0) return 0;
        sum = sumFR(n-1) + (int)Math.pow(n, 3);
        return sum;
    }
}

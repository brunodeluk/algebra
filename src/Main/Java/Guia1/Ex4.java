package Guia1;

/**
 * Sea An = {a1, a2, ...,an}, verificar si el conjunto es capicúa, es decir a1 = an; a2 = an-1, etc
 * @author Nicolas Curat, Bruno De Luca
 */

public class Ex4 {

    /**
     * Algoritmo iteratico que devuelve true si el conjunto es capicua
     * @param base conjunto inicial
     * @return boolean si es capicua
     */

    public boolean palindromeIterative(int[] base) {
        int n = Math.round(base.length);
        for(int i = 0; i < n; i++)
            if(base[i] != base[base.length - 1 - i]) return false;
        return true;
    }

    /**
     * Algoritmo recursivo que devuelve true si el conjunto es capicua
     * @param base conjunto inicial
     * @return boolean si es capicua
     */

    public boolean palindromeRecursive(int[] base){
        return palindromeRecursive(base, 0, Math.round(base.length));
    }

    private boolean palindromeRecursive(int[] base, int i, int n){
        if(base[i] != base[base.length - 1 - i]) return false;
        if(i == n-1) return true;
        return palindromeRecursive(base, i+1, n);
    }
}

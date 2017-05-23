package guia6;

/**
 * Esta clase prove algoritmos para usar con una matriz cuadrada.
 * @author Nicolas Curat, Bruno De Luca
 */
public class Ex2 implements Exercise2 {

    /**
     * Metodo para verificar si una matriz es simetrica.
     * @param matrix matriz
     * @param calculator calculadora para resolver operaciones
     * @return true si es simetrica, false si no lo es
     */
    @Override
    public boolean exerciseA(double[][] matrix, Calculator calculator) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] != matrix[j][i]) return false;
            }
        }
        return true;
    }

    /**
     * Metodo para verificar si una matriz es diagonalmente dominante.
     * @param matrix matriz
     * @param calculator calculadora para resolver operaciones
     * @return true si es diagonalmente dominante, false si no lo es
     */
    @Override
    public boolean exerciseB(double[][] matrix, Calculator calculator) {
        if(matrix.length == matrix[0].length){
            for (int i = 0; i < matrix.length; i++) {
                double sumOfRow = 0;
                double diagonal = matrix[i][i];
                for (int j = 0; j < matrix[0].length; j++) {
                    if(i != j){
                        sumOfRow = calculator.sum(sumOfRow, Math.abs(matrix[i][j]));
                    }
                }
                if(diagonal < sumOfRow) return false;
            }
            return true;
        }
        throw new RuntimeException("This matrix is not square!");
    }
}

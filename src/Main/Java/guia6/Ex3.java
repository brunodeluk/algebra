package guia6;

/**
 * Esta clase prove metodos para la manipulacion de matrices especiales
 * @author Nicolas Curat, Bruno De Luca
 */
public class Ex3 implements Exercise3 {

    /**
     * Metodo para realizar la multiplicacion de una matriz triangular superior (n*n) y un vector(n)
     * @param matrixA matrizA
     * @param vectorX vector para multiplicacion
     * @param calculator calculadora para resolver operaciones
     * @return vector dado por la multiplicacion de una matriz y un vector
     */
    @Override
    public double[] exerciseAI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        int aRow = matrixA.length;
        int aColumn = matrixA[0].length;
        int bRow = vectorX.length;

        if(aColumn != bRow) throw new IllegalArgumentException("A:Rows: " + aRow + " don't match B:Columns " + aColumn + ".");

        double[] c = new double[bRow];

        for(int i = 0; i < aRow; i++){
            for(int j = 0; j < aRow; j++){
                c[i] += calculator.multiplication(matrixA[i][j], vectorX[j]);
            }
        }

        return c;

    }

    /**
     * Metodo para realizar la suma de dos matrices triangulares superiores (n*n)
     * @param matrixA matrizA
     * @param matrixB matrizB para multiplicacion
     * @param calculator calculadora para resolver operaciones
     * @return matriz dado por la multiplicacion de dos matrices
     */
    @Override
    public double[][] exerciseAII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        int aRow =matrixA.length;
        int aColumn = matrixA[0].length;
        int bRow = matrixB.length;
        int bColumn = matrixB[0].length;

        if((aRow != bRow) || (aColumn != bColumn)) throw new IllegalArgumentException("Both matrix should have the same size");

        double[][] c = new double[aRow][aColumn];

        for(int i = 0; i < aRow; i++){
            for(int j = 0; j < aColumn; j++){
                c[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
            }
        }
        return c;
    }

    /**
     * Metodo para realizar la multiplicacion de dos matrices triangulares superiores (n*n)
     * @param matrixA matrizA
     * @param matrixB matrizB para multiplicacion
     * @param calculator calculadora para resolver operaciones
     * @return matriz dado por la multiplicacion de dos matrices
     */
    @Override
    public double[][] exerciseAIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        int aRow = matrixA.length;
        int aColumn = matrixA[0].length;
        int bRow = matrixB.length;
        int bColumn = matrixB[0].length;

        if(aColumn != bRow) throw new IllegalArgumentException("A:Rows: " + aRow + " don't match B:Columns " + aColumn + ".");

        double[][] c = new double[aRow][bColumn];

        for(int i = 0; i < aRow; i++){
            for(int j = 0; j < bColumn; j++){
                for(int k = 0; k < aColumn; k++){
                    c[i][j] += calculator.multiplication(matrixA[i][k],matrixB[k][j]);
                }
            }
        }
        return c;
    }

    /**
     * Metodo para realizar la multiplicacion de una matriz de Hessenberg (n*n) y un vector(n)
     * @param matrixA matrizA
     * @param vectorX vector para multiplicacion
     * @param calculator calculadora para resolver operaciones
     * @return vector dado por la multiplicacion de una matriz y un vector
     */
    @Override
    public double[] exerciseBI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        int aRow = matrixA.length;
        int aColumn = matrixA[0].length;
        int bRow = vectorX.length;

        if(aColumn != bRow) throw new IllegalArgumentException("A:Rows: " + aRow + " don't match B:Columns " + aColumn + ".");

        double[] c = new double[bRow];

        for(int i = 0; i < aRow; i++){
            for(int j = 0;j < i + 2 && j < aRow; j++){
                if(matrixA[i][j] == 0) break;
                c[0] += calculator.multiplication(matrixA[i][j], vectorX[j]);
            }
        }

        return c;
    }

    /**
     * Metodo para realizar la suma de dos matrices de Hessenberg (n*n)
     * @param matrixA matrizA
     * @param matrixB matrizB para multiplicacion
     * @param calculator calculadora para resolver operaciones
     * @return matriz dado por la multiplicacion de dos matrices
     */
    @Override
    public double[][] exerciseBII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        int aRow =matrixA.length;
        int aColumn = matrixA[0].length;
        int bRow = matrixB.length;
        int bColumn = matrixB[0].length;

        if((aRow != bRow) || (aColumn != bColumn)) throw new IllegalArgumentException("Both matrix should have the same size");

        double[][] c = new double[aRow][aColumn];

        for(int i = 0; i < aRow; i++){
            for(int j = 0;j < i + 2 && j < aColumn; j++){
                if(matrixA[i][j] == 0) break;
                c[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
            }
        }
        return c;
    }

    /**
     * Metodo para realizar la multiplicacion de dos matrices de Hessenberg (n*n)
     * @param matrixA matrizA
     * @param matrixB matrizB para multiplicacion
     * @param calculator calculadora para resolver operaciones
     * @return matriz dado por la multiplicacion de dos matrices
     */
    @Override
    public double[][] exerciseBIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        int aRow = matrixA.length;
        int aColumn = matrixA[0].length;
        int bRow = matrixB.length;
        int bColumn = matrixB[0].length;

        if(aColumn != bRow) throw new IllegalArgumentException("A:Rows: " + aRow + " don't match B:Columns " + aColumn + ".");

        double[][] c = new double[aRow][bColumn];

        for(int i = 0; i < aRow; i++){
            for(int j = 0; j < bColumn; j++){
                for(int k = 0;j < i + 2 && k < aColumn; k++){
                    if(matrixA[i][j] == 0) break;
                    c[i][j] += calculator.multiplication(matrixA[i][k],matrixB[k][j]);
                }
            }
        }
        return c;
    }

    /**
     * Metodo para realizar la multiplicacion de una matriz tridiagonal (n*n) y un vector(n)
     * @param matrixA matrizA
     * @param vectorX vector para multiplicacion
     * @param calculator calculadora para resolver operaciones
     * @return vector dado por la multiplicacion de una matriz y un vector
     */
    @Override
    public double[] exerciseCI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        int aRow = matrixA.length;
        int aColumn = matrixA[0].length;
        int bRow = vectorX.length;

        if(aColumn != bRow) throw new IllegalArgumentException("A:Rows: " + aRow + " don't match B:Columns " + aColumn + ".");

        double[] c = new double[bRow];

        for(int i = 0; i < aRow; i++){
            for(int j = 0;j < i + 2 && j < aRow; j++){
                if(Math.abs(i - j) <= 1)
                    c[i] += calculator.multiplication(matrixA[i][j], vectorX[j]);
            }
        }

        return c;
    }

    /**
     * Metodo para realizar la suma de dos matrices tridiagonales (n*n)
     * @param matrixA matrizA
     * @param matrixB matrizB para multiplicacion
     * @param calculator calculadora para resolver operaciones
     * @return matriz dado por la multiplicacion de dos matrices
     */
    @Override
    public double[][] exerciseCII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        int aRow =matrixA.length;
        int aColumn = matrixA[0].length;
        int bRow = matrixB.length;
        int bColumn = matrixB[0].length;

        if((aRow != bRow) || (aColumn != bColumn)) throw new IllegalArgumentException("Both matrix should have the same size");

        double[][] c = new double[aRow][aColumn];

        for(int i = 0; i < aRow; i++){
            for(int j = 0;j < i + 2 && j < aColumn; j++){
                if(Math.abs(i - j) <= 1)
                    c[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
            }
        }
        return c;
    }

    /**
     * Metodo para realizar la multiplicacion de dos matrices tridiagonales (n*n)
     * @param matrixA matrizA
     * @param matrixB matrizB para multiplicacion
     * @param calculator calculadora para resolver operaciones
     * @return matriz dado por la multiplicacion de dos matrices
     */
    @Override
    public double[][] exerciseCIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        int aRow =matrixA.length;
        int aColumn = matrixA[0].length;
        int bRow = matrixB.length;
        int bColumn = matrixB[0].length;

        if((aRow != bRow) || (aColumn != bColumn)) throw new IllegalArgumentException("Both matrix should have the same size");

        double[][] c = new double[aRow][aColumn];

        for(int i = 0; i < aRow; i++){
            for(int j = 0;j < i + 2 && j < aColumn; j++){
                if(Math.abs(i - j) <= 1)
                    c[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
            }
        }
        return c;
    }

    /**
     * Metodo para realizar la multiplicacion de una matriz banda (n*n) y un vector(n)
     * @param matrixA matrizA
     * @param k1A semiancho de banda izquierdo
     * @param k2A semiancho de banda derecha
     * @param vectorX vector para multiplicacion
     * @param calculator calculadora para resolver operaciones
     * @return vector dado por la multiplicacion de una matriz y un vector
     */
    @Override
    public double[] exerciseDI(double[][] matrixA, int k1A, int k2A, double[] vectorX, Calculator calculator) {
        int aRow = matrixA.length;
        int aColumn = matrixA[0].length;
        int bRow = vectorX.length;

        if(aColumn != bRow) throw new IllegalArgumentException("A:Rows: " + aRow + " don't match B:Columns " + aColumn + ".");

        if(k1A != k2A) throw new IllegalArgumentException();

        double[] c = new double[bRow];

        for(int i = 0; i < aRow; i++){
            for(int j = 0;j < i + 2 && j < aRow; j++){
                if(Math.abs(j - 1) <= k1A + 1)
                    c[i] += calculator.multiplication(matrixA[i][j], vectorX[j]);
            }
        }

        return c;
    }

    /**
     * Metodo para realizar la suma de dos matrices banda (n*n)
     * @param matrixA matrizA
     * @param k1A semiancho de banda izquierdo de la matriz A
     * @param k2A semiancho de banda derecha de la matriz A
     * @param matrixB matrizB para multiplicacion
     * @param k1B semiancho de banda izquierdo de la matriz B
     * @param k2B semiancho de banda derecha de la matriz B
     * @param calculator calculadora para resolver operaciones
     * @return matriz dado por la multiplicacion de dos matrices
     */
    @Override
    public double[][] exerciseDII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator) {
        int aRow =matrixA.length;
        int aColumn = matrixA[0].length;
        int bRow = matrixB.length;
        int bColumn = matrixB[0].length;

        if((aRow != bRow) || (aColumn != bColumn)) throw new IllegalArgumentException("Both matrix should have the same size");

        if(k1A != k2A) throw new IllegalArgumentException();

        double[][] c = new double[aRow][aColumn];

        for(int i = 0; i < aRow; i++){
            for(int j = 0;j < i + 2 && j < aColumn; j++){
                if(Math.abs(j - 1) <= k1A + 1)
                    c[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
            }
        }
        return c;
    }

    /**
     * Metodo para realizar la multiplicacion de dos matrices banda (n*n)
     * @param matrixA matrizA
     * @param k1A semiancho de banda izquierdo de la matriz A
     * @param k2A semiancho de banda derecha de la matriz A
     * @param matrixB matrizB para multiplicacion
     * @param k1B semiancho de banda izquierdo de la matriz B
     * @param k2B semiancho de banda derecha de la matriz B
     * @param calculator calculadora para resolver operaciones
     * @return matriz dado por la multiplicacion de dos matrices
     */
    @Override
    public double[][] exerciseDIII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator) {
        int aRow =matrixA.length;
        int aColumn = matrixA[0].length;
        int bRow = matrixB.length;
        int bColumn = matrixB[0].length;

        if((aRow != bRow) || (aColumn != bColumn)) throw new IllegalArgumentException("Both matrix should have the same size");

        if(k1A != k2A || k1B != k2B || k1A != k1B) throw new IllegalArgumentException();

        double[][] c = new double[aRow][aColumn];

        for(int i = 0; i < aRow; i++){
            for(int j = 0;j < i + 2 && j < aColumn; j++){
                if(Math.abs(j - 1) <= k1A + 1)
                    c[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
            }
        }
        return c;
    }

    /**
     * Metodo para construir la matriz producto entre una matrizA triangular inferior y una matrizB superior.
     * @param matrixA matriz A triangular inferior
     * @param matrixB matriz B triangular superior
     * @param calculator calculadora para resolver operaciones
     * @return matriz producto entre dos matrices
     */
    @Override
    public double[][] exerciseE(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        if(matrixA[0].length == matrixB.length){
            double[][] result = new double[matrixA.length][matrixB[0].length];
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixB[0].length; j++) {
                    for (int k = 0; k < matrixA[0].length; k++) {
                        double aux;
                        if(matrixA[i][k] == 0 || matrixB[k][j] == 0)
                            aux = 0;
                        else
                            aux = calculator.multiplication(matrixA[i][k], matrixB[k][j]);
                        result[i][j] = calculator.sum(result[i][j],aux);
                    }
                }
            }
            return result;
        }
        throw new RuntimeException("Column length in Matrix A must be equal to quantity of rows in Matrix B");
    }
}

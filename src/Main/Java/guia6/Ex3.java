package guia6;

public class Ex3 implements Exercise3 {
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

    @Override
    public double[][] exerciseE(double[][] matrixA, double[][] matrixB, Calculator calculator) {

    }
}

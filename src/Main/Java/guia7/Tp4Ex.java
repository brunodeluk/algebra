package guia7;

public class Tp4Ex implements TP4 {

    @Override
    public double[] exercise1(double[][] coefficients, double[] independentTerms) {
        double[] results = new double[independentTerms.length];

        int i = 0;
        while(i < results.length){
            for(int j = 0; j < i; j++){
                results[results.length - 1 - i] -= results[results.length - 1 - j]*coefficients[coefficients.length - 1 - i][coefficients.length - 1 - j];
            }
            results[results.length - 1 - i] += independentTerms[independentTerms.length - 1 - i];
            i++;
        }

        return results;
    }

    @Override
    public double[] exercise2(double[][] coefficients, double[] independentTerms) {
        double[] results = new double[independentTerms.length];

        int i = 0;
        while(i < results.length){
            for(int j = 0; j < i; j++){
                results[i] -= results[j]*coefficients[i][j];
            }
            results[i] += independentTerms[i];
            results[i] /= coefficients[i][i];
            i++;
        }

        return results;
    }

    @Override
    public double[] exercise5WithoutPivoteo(double[][] coefficients, double[] independentTerms) {
        int row = coefficients.length;
        int col = coefficients[0].length;
        int indTermsLenght = independentTerms.length;

        if(row != col) throw new IllegalArgumentException();
        if(col != indTermsLenght) throw new IllegalArgumentException();

        for(int i = 0; i < col - 1; i++){
            normalize(coefficients, independentTerms, i);
            for(int j = i + 1; j < row; j++){
                double pivot = coefficients[j][i];
                for(int k = 0; k < col; k++){
                    coefficients[j][k] = coefficients[i][k]*pivot - coefficients[j][k];
                }
                independentTerms[j] = independentTerms[i]*pivot - independentTerms[j];
            }
        }

        normalize(coefficients, independentTerms, col - 1);

        return exercise1(coefficients, independentTerms);
    }



    @Override
    public double[] exercise5PartialPivoteo(double[][] coefficients, double[] independentTerms) {
        int row = coefficients.length;
        int col = coefficients[0].length;
        int indTermsLenght = independentTerms.length;

        if(row != col) throw new IllegalArgumentException();
        if(col != indTermsLenght) throw new IllegalArgumentException();

        for(int i = 0; i < col - 1; i++){
            switchRows(coefficients, independentTerms, i);
            normalize(coefficients, independentTerms, i);
            for(int j = i + 1; j < row; j++){
                double pivot = coefficients[j][i];
                for(int k = 0; k < col; k++){
                    coefficients[j][k] = coefficients[i][k]*pivot - coefficients[j][k];
                }
                independentTerms[j] = independentTerms[i]*pivot - independentTerms[j];
            }
        }

        normalize(coefficients, independentTerms, col - 1);

        return exercise1(coefficients, independentTerms);

    }

    private void normalize(double[][] matrix, double[] terms, int position){
        double pivote = matrix[position][position];
        for(int i = position; i < matrix[0].length; i++) matrix[position][i] /= pivote;
        terms[position] /= pivote;
    }

    private void switchRows(double[][] coefficients, double[] independentTerms, int position){

        double k = coefficients[position][position];
        int posK = position;

        for(int i = position + 1; i < coefficients.length; i++){
            if(coefficients[i][position] > k) posK = i;
        }

        for(int i = position; i < coefficients[0].length; i++){
            double aux = coefficients[position][i];
            coefficients[position][i] = coefficients[posK][i];
            coefficients[posK][i] = aux;
        }

        double aux2 = independentTerms[position];
        independentTerms[position] = independentTerms[posK];
        independentTerms[posK] = aux2;
    }



    @Override
    public double[] exercise6(double[][] coefficients, double[] independentTerms, Calculator calculator) {
        double[] result;
        //Descendant Part.
        for (int i = 0; i < coefficients.length; i++) {
            double pivot = coefficients[i][i];
            double value = 0;
            if(i+1 != coefficients.length) { //Guardo el valor de la fila de abajo en la posicion 0
                value = coefficients[i+1][i];
            }
            for (int j = 0; j < coefficients.length; j++) {
                coefficients[i][j] = coefficients[i][j]/pivot; //Me asegura que la diagonal sea 1.
                if(i+1 != coefficients.length && j >= i){ //Me asegura que no me este metiendo en 0 que yase por Hessemberg que estan en la matriz
                    coefficients[i+1][j] = coefficients[i+1][j] - (coefficients[i][j]*value);
                }
            }
            independentTerms[i] = independentTerms[i]/pivot;
            if(i+1 != coefficients.length){
                independentTerms[i+1] = independentTerms[i+1] - (independentTerms[i] * value);
            }
        }
        //Ascendant Part.
        result = exercise1(coefficients, independentTerms);
        return result;
    }

    @Override
    public double[] exercise7(double[][] coefficients, double[] independentTerms, Calculator calculator) {
        double[] result;
        //Descendant Part.
        for (int i = 0; i < coefficients.length; i++) {
            double pivot = coefficients[i][i];
            double value = 0;
            if(i+1 != coefficients.length) {
                value = coefficients[i+1][i];
            }
            for (int j = 0; j < coefficients.length; j++) {
                if(j+2 != coefficients.length && j < i+2) { //Se fija que no haga cambios a 0 que yase que estan por ser matriz tridiagonal
                    coefficients[i][j] = coefficients[i][j] / pivot; //Me asegura que la diagonal sea 1.
                }
                if(i+1 != coefficients.length && j >= i){ //Me asegura que no me este metiendo en 0 que yase que estan en la matriz tridiagonal
                    coefficients[i+1][j] = coefficients[i+1][j] - (coefficients[i][j]*value);
                }
            }
            independentTerms[i] = independentTerms[i]/pivot;
            if(i+1 != coefficients.length){
                independentTerms[i+1] = independentTerms[i+1] - (independentTerms[i] * value);
            }
        }
        //Ascendant Part.
        result = exercise1(coefficients, independentTerms);
        return result;
    }

    @Override
    public double[][] exercise8(double[][] coefficients) {
        int row = coefficients.length;
        int col = coefficients[0].length;

        double[][] identity = new double[row][col];

        for(int i = 0; i < col; i++) identity[i][i] = 1;

        //triangular superiormente

        for(int i = 0; i < col - 1; i++){
            for(int j = i + 1; j < row; j++){
                double pivotA = coefficients[i][i];
                double pivot = coefficients[j][i];
                for(int k = 0; k < col; k++){
                    coefficients[j][k] = coefficients[j][k] - (coefficients[i][k]*pivot) / pivotA;
                    identity[j][k] = identity[j][k] - (identity[i][k]*pivot) / pivotA;
                }
            }
        }

        //triangular inferiormente

        for(int i = col - 1; i > 0; i--){
            for(int j = i - 1; j >= 0; j--){
                double pivotA = coefficients[i][i];
                double pivot = coefficients[j][i];
                for(int k = 0; k < col; k++){
                    coefficients[j][k] = coefficients[j][k] - (coefficients[i][k]*pivot) / pivotA;
                    identity[j][k] = identity[j][k] - (identity[i][k]*pivot) / pivotA;
                }
            }
        }

        //normalizar identidad

        normalize(identity, coefficients);

        return identity;
     }

    public void normalize(double[][] identity, double[][] coefficients){
        for(int i = 0; i < identity.length; i++){
            for(int j = 0; j < identity[0].length; j++){
                identity[i][j] /= coefficients[i][i];
            }
        }
    }


    @Override
    public double[] exercise9(double[][] coefficients, double[] independentTerms) {

        double[][] l = new double[coefficients.length][coefficients.length];
        double[][] u = new double[coefficients.length][coefficients.length];

        for (int i = 0; i < l.length; i++) {
            l[i][i] = 1;
        }

        for (int k = 0; k < coefficients.length; k++) {
            for (int j = k; j < coefficients.length; j++) {
                u[k][j] = coefficients[k][j];
                double sum = 0;
                for (int p = 0; p < k; p++) {
                    sum += l[k][p]*u[p][j];
                }
                u[k][j] -= sum;
            }

            for (int i = 0; i < coefficients.length; i++) {
                l[i][k] = coefficients[i][k];

                double summation = 0;
                for (int p = 0; p < k; p++) {
                    summation += l[i][p]*u[p][k];
                }
                l[i][k] -= summation;
                l[i][k] /= u[k][k];
            }
        }

        double[] z = exercise2(l,independentTerms);
        return solveUp(u, z);
    }

    private double[] solveUp(double[][] coefficients, double[] independentTerms) {
        double[] result = new double[coefficients.length];

        for (int i = coefficients.length -1; i >= 0 ; i--) {
            result[i] = independentTerms[i];
            double summation = 0;
            for (int j = i+1; j < coefficients.length; j++) {
                summation += coefficients[i][j] * result[j];
            }
            result[i] -= summation;
            result[i] /= coefficients[i][i];
        }
        return result;
    }

    public static void main(String[] args) {
        Tp4Ex tp4Ex = new Tp4Ex();
        double[][] d = {{2, 3}, {4, -7}};
        double[] p = {-1, 11};
        double[] r = tp4Ex.exercise5WithoutPivoteo(d, p);

        for(int i = 0; i < r.length; i++){
            System.out.println(r[i]);
        }
    }
}

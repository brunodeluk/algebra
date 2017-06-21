public class Curi {

    private boolean ex2P(double[][] coefficients){
        for (int i = 0; i < coefficients.length; i++) {
            if(coefficients[i][i+1] != coefficients[i+1][i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        double[][] coeff = {{0.5, 1.5, 0.7}, {1.0, 0.0, 2.0}, {2.0, 1.2, -0.3}};
        double[] b = {-0.3, 3.0, 0.5};
        Curi sp = new Curi();
        double[] result = sp.ex3(coeff, b);
    }

    public double[] ex3(double[][] coefficients, double[] b){
        double[] result;
        //Primer proceso
        for (int i = coefficients.length-1; i >= 0; i--) {
            double pivot = coefficients[i][i];
            for (int j = coefficients.length-1; j >= 0; j--) {
                coefficients[i][j] = coefficients[i][j]/pivot;
            }
            b[i] = b[i]/pivot;
            changesToMatrix(coefficients, b, i);
        }
        //Segundo proceso
        result = solvingMatrix(coefficients, b);
        return result;
    }

    private void changesToMatrix(double[][] coefficients, double[] b, int i){
        for (int j = i - 1; j >= 0; j--) { //j sera las nuevas filas
            double value = coefficients[j][i];
            for (int k = i; k >= 0; k--) { //k va a determinar las columnas
                coefficients[j][k] = coefficients[j][k] - (coefficients[i][k]*value);
            }
            b[j] = b[j] - (b[i]*value);
        }
    }

    private double[] solvingMatrix(double[][] coefficients, double[] b){
        double[] result = new double[b.length];
        result[0] = b[0];
        for (int i = 1; i < coefficients.length; i++) {
            result[i] = b[i];
            for (int j = 0; j < i; j++) {
                result[i] -= (coefficients[i][j]*result[j]);
            }
        }
        return result;
    }
}
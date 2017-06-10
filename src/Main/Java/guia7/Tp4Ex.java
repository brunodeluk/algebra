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
        return new double[0];
    }

    @Override
    public double[] exercise5PartialPivoteo(double[][] coefficients, double[] independentTerms) {
        return new double[0];
    }

    @Override
    public double[] exercise6(double[][] coefficients, double[] independentTerms, Calculator calculator) {

    }

    @Override
    public double[] exercise7(double[][] coefficients, double[] independentTerms, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[][] exercise8(double[][] coefficients) {
        return new double[0][];
    }

    @Override
    public double[] exercise9(double[][] coefficients, double[] independentTerms) {
        return new double[0];
    }
}

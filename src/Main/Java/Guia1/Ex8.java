package Guia1;

/**
 * Created by brunodeluca on 3/18/17.
 */
public class Ex8 {

    public float horner(float[]p, float x){
        float result = 0;
        for(int i = p.length -1 ; i >= 0; i++){
            result = p[i] + (result * x);
        }
        return result;
    }

    public float hornerRecursive(float[] p, float x){
        return hornerRecursive(p, x, 0, p.length - 1);
    }

    private float hornerRecursive(float[] p, float x, float result, int i){
        if(i < 0) return result;
        result = p[i] + (result * x);
        return hornerRecursive(p, x, result, i - 1);
    }

    public float function(float[] p, float x){
        float result = 0;

        for(int i = 0; i < p.length; i++){
            int a = 0;
            for(int j = 0; j == i; j++){
                a += a;
            }
            result = p[i]*a;
        }
    }
}

package Guia1;


public class Ex7 {

    //I use the same recursive method i created in exercise 2 item d.
    private int mcd(int a, int b){
        return (b == 0)? a : mcd(b, a%b);
    }

    //Iterative
    private int mcdIterative(int a, int b){
        if(b == 0) return a;
        int remainder;
        while(true) {
            remainder = a%b;
            a = b;
            b = remainder;
            if(remainder == 0) return a;
        }
    }

    public void calculate(){
        System.out.println("i) " + mcd(123, 277));
        System.out.println("ii) " + mcd(111, 201));
        System.out.println("iii) " + mcd(14039, 1529));
        System.out.println("i) " + mcdIterative(123, 277));
        System.out.println("ii) " + mcdIterative(111, 201));
        System.out.println("iii) " + mcdIterative(14039, 1529));
    }
}

package Patterns;

public class Factorial {

    public static void main(String[] args) {
        int n=4;
        factorial(n);
        System.out.println(factorial(n));
    }
    static int factorial(int num){
        int fact=1;
        while(num!=0){
            fact = fact*num;
            num--;
        }
        return fact;
    }
}

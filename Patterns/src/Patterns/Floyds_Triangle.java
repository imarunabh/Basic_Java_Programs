package Patterns;

public class Floyds_Triangle {

    public static void main(String[] args) {
        int m=5;
        int a=1;
        for(int i =1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a=a+1;
            }
            System.out.println();
        }
    }
}

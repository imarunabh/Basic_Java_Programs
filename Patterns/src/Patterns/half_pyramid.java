package Patterns;

public class half_pyramid {
    public static void main(String[] args) {
        int m=4;
        int n=4;
        for(int i =1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

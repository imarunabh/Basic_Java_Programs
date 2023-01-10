package Patterns;

public class number_pyramid {
    public static void main(String[] args) {
        int m=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

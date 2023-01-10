package Patterns;

public class solid_rhombus {
    public static void main(String[] args) {
        int m=5;
        int n=9;
        for(int i=1;i<5;i++){
            for(int j=0;j<=(n-4-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<=5;j++){
                System.out.print("* ");
            }
            for(int j=0;j<=4;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

package Patterns;

public class Diamond {
    public static void main(String[] args) {
        int m=4;
        //first half
        for(int i=1;i<=m;i++){
            for(int j=0;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(int i=m;i>=0;i--){
            for(int j=0;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

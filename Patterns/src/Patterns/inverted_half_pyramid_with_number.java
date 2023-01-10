package Patterns;

public class inverted_half_pyramid_with_number {
    public static void main(String[] args) {
        int m=5;
        for(int i =m;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

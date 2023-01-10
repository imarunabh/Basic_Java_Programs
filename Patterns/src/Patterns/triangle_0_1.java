package Patterns;

public class triangle_0_1 {
    public static void main(String[] args) {
        int m=5;
        int a=1;
//        for(int i =1;i<=m;i++){
//            for(int j=1;j<=i;j++){
//              if(a==1){
//                  System.out.print(a+" ");
//                  a--;
//              }
//              else{
//                  System.out.print(a+" ");
//                  a++;
//              }
//            }
//            System.out.println();
//        }
        for(int i =1;i<=m;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0)
                    System.out.print(1+" ");
                else
                    System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}

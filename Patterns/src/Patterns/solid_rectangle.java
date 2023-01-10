package Patterns;

public class solid_rectangle {

    public static void main(String[] args) {
//////////////Writing all  the stars in a single line and printing/////////////////////////////
//        for(int i=0;i<4;i++){
//            System.out.println("****");
//
//        }

        /////////////////////writing each and every stars ///////////////////////
//        for(int i=1;i<=4;i++){
//            System.out.print("*");
//            System.out.print("*");
//            System.out.print("*");
//            System.out.print("*");
//            System.out.println();
//        }

//////////////////using double loop,one loop for printing row stars and another for printing the column stars///////////////////////////

        for(int i =1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

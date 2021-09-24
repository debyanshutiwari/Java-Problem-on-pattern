//   *
//  * *
// *   *
//*******

package com.debyanshu;

public class Pattern_number_13 {
    public static void main(String[] args) {
pattern(4);
    }
    static void pattern(int n){
        for (int row = 1; row <=n ; row++) {
            for (int space = 0; space <n-row ; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=(row*2)-1 ; col++) {
    if(col==1 || col==(row*2)-1 ||n==row ){
        System.out.print("*");
    }
    else{
        System.out.print(" ");
    }
            }
            System.out.println();
        }
    }
}


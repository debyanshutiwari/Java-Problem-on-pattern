//* * * * *
// * * * *
//  * * *
//   * *
//    *
package com.debyanshu;

public class Pattern_number_11 {
    public static void main(String[] args) {
pattern(4);
    }
    static void pattern(int n){
        for (int row = 0; row <=n ; row++) {
            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <=n-row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}

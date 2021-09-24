//   *
//   ***
//  *****
// *******
//*********

package com.debyanshu;

public class Pattern_number_8 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int row = 0; row <=n; row++) {
            for (int space = 0; space <n-row ; space++) {
                System.out.print(" ");
            }
            for (int col =0 ; col <2*row-1 ; col++) {//1  2

                System.out.print("*");
            }
            System.out.println();
        }
    }
}

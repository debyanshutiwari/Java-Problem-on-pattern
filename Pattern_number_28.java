//   *
//   **
//  ***
// ****
//*****
// ****
//  ***
//   *
//   * *
//  * * *
// * * * *
//* * * * *
// * * * *
//  * * *
//   * *
//    *

package com.debyanshu;

import java.util.Arrays;

public class Pattern_number_28 {
    public static void main(String[] args) {
     pattern(5);
    }
    static void pattern(int n){
        for (int row = 0; row <2*n ; row++) {
            int totalcolumn=row>n ? 2*n-row :row;

            
            
            int totalspace=n-totalcolumn; // for space
            for (int space = 0; space < totalspace; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <totalcolumn ; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

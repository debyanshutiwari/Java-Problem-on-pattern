// ****
//  ***
//   **
//    *

package com.debyanshu;

public class Pattern_number_7 {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <row ; space++) {//1
                System.out.print(" ");
            }
            for (int col = row; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }

}
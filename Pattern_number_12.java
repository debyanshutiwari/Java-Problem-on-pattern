// * * * * *
//  * * * *
//   * * *
//    * *
//     *
//     *
//    * *
//   * * *
//  * * * *
// * * * * *

package com.debyanshu;

public class Pattern_number_12 {
    public static void main(String[] args) {
pattern(4);

    }
    static void pattern(int n){
        for (int row = 0; row <=n ; row++) {
            for (int space = 0; space <=row ; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <=n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();


            }
        for (int r = 0; r <=n; r++) {
            for (int space = 0; space <=n-r ; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= r; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}

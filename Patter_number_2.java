// *  *  *  *
//*   *   *  *
// *  *   *  *
//*   *   *  *

package com.debyanshu;

import java.util.Scanner;

public class Patter_number_2 {
    public static void main(String[] args) {
debyanshu(4);

    }
    static void debyanshu(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n ; col++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}

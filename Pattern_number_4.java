//      1
//   1      2
//  1    2     3
// 1    2    3    4
// 1    2    3   4    5


package com.debyanshu;

public class Pattern_number_4 {
    public static void main(String[] args) {
  patter(5);
    }
    static void patter(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col);

            }
            System.out.println();

        }
    }
}


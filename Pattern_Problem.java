//  *
// *  *
//*  *   *
//*  *   *   *



package com.debyanshu;

public class Pattern_Problem {
    public static void main(String[] args) {
        debyanshu(4);
    }
    static void debyanshu(int n){
        for (int row = 1; row <=n ; row++) { //no. of row in outerloop .//VERY IMP

            for (int col = 1; col <=row ; col++) { // col will go till less or equal to row

                System.out.print("* ");//What to print
            }
            System.out.println(); //to give new line after each row
        }
    }
}

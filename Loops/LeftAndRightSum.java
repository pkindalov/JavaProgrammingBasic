package Loops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 08.01.17.
 */
public class LeftAndRightSum {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < 2 * n ; i++) {
            int userNumber = Integer.parseInt(console.nextLine());
            if(i < n){
                leftSum += userNumber;
            }else {
                rightSum += userNumber;
            }
        }

//        System.out.println(leftSum);
//        System.out.println(rightSum);

        if(leftSum == rightSum) {
            System.out.println("Yes, sum = " +leftSum);
        }else {
            System.out.println("No, diff = " + Math.abs(leftSum - rightSum));
        }



    }

}

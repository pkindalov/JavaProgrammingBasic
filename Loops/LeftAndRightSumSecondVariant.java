package Loops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 08.01.17.
 */
public class LeftAndRightSumSecondVariant {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        int num = Integer.parseInt(console.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < num ; i++) {
            int userNumber = Integer.parseInt(console.nextLine());
            leftSum += userNumber;
        }


        for (int i = 0; i < num; i++) {
            int userNumber = Integer.parseInt(console.nextLine());
            rightSum += userNumber;
        }


        if(leftSum == rightSum){
            System.out.println("Yes, sum = " + leftSum);
        }else {
            System.out.println("No, diff = " + Math.abs(leftSum - rightSum));
        }

    }

}

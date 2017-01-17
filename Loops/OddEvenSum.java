package Loops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 08.01.17.
 */
public class OddEvenSum {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= n ; i++) {
            int userNumber = Integer.parseInt(console.nextLine());

            if(i % 2 == 0){
                evenSum += userNumber;
            }else {
                oddSum += userNumber;
            }

        }

        if(evenSum == oddSum){
            System.out.println("Yes");
            System.out.println("Sum = " + evenSum);
        }else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(evenSum - oddSum));
        }


//        System.out.println(evenSum);
//        System.out.println(oddSum);

    }

}

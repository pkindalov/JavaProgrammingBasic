package Loops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 08.01.17.
 */
public class MaxNumber {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < n ; i++) {
            int userNumber = Integer.parseInt(console.nextLine());
            if(userNumber > maxNumber){
                maxNumber = userNumber;
            }
        }

        System.out.println(maxNumber);


    }

}

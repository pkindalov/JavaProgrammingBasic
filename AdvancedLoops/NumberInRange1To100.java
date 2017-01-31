package AdvancedLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 10.01.17.
 */
public class NumberInRange1To100 {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int userNum = Integer.parseInt(console.nextLine());

        while (userNum < 1 || userNum > 100){
            System.out.println("Invalid number");
            userNum = Integer.parseInt(console.nextLine());
        }

        System.out.println("The number is " + userNum);
    }

}

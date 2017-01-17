package Loops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 08.01.17.
 */
public class SumNumbers {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        int howManyNumbers = Integer.parseInt(console.nextLine());
        int sum = 0;

        for (int i = 0; i < howManyNumbers ; i++) {
            int currentNumber = Integer.parseInt(console.nextLine());
            sum += currentNumber;
        }


        System.out.println(sum);


    }

}

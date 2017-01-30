package AdvancedLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 10.01.17.
 */
public class Fibonacci {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int numbers = Integer.parseInt(console.nextLine());
        int f0 = 0;
        int f1 = 1;
        int sum = 0;

//        System.out.print(f0 + " ");
//        System.out.print(f1 + " ");

        for (int i = 1; i <= numbers ; i++) {
              sum = f0 + f1;
              f0 = f1;
              f1 = sum;

            //System.out.print(sum + " ");
        }

        System.out.println(f1);

    }
}

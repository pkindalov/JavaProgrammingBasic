package AdvancedLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 11.01.17.
 */
public class Tribonacci {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int f0 = 0;
        int f1 = 1;
        int f2 = 1;
        int sum = 0;

        System.out.print(f0 + " " + f1 + " " + f2 + " ");
        for (int i = 0; i < n ; i++) {

            sum = f0 + f1 + f2;
            f0 = f1;
            f1 = f2;
            f2 = sum;


            System.out.print(sum + " ");
        }



    }

}

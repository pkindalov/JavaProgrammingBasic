package AdvancedLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 10.01.17.
 */
public class SumDigits {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum = 0;

        while (n > 0){
            sum += (n % 10);
            n /= 10;
        }

        System.out.println(sum);

    }

}

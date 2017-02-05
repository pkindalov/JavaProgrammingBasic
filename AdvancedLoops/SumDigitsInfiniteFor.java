package AdvancedLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 10.01.17.
 */
public class SumDigitsInfiniteFor {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum = 0;

        for( ; ; ){
            sum += (n % 10);
            n /= 10;
            if(n == 0){
                break;
            }
        }

        System.out.println(sum);


    }

}

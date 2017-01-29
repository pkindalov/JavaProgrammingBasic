package AdvancedLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 10.01.17.
 */
public class FactorialWithReverseForLoop {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        long fact = 1;

        for (int i = n; i > 1 ; i--) {
            fact *= i;
        }

        System.out.println(fact);

    }

}

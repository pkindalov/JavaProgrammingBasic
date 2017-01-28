package AdvancedLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 10.01.17.
 */
public class FactorialWithDoWhile {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        long fact = 1;

        do{
            fact *= n;
            n--;
        }while (n > 1);

        System.out.println(fact);
    }

}

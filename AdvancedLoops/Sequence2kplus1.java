package AdvancedLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 10.01.17.
 */
public class Sequence2kplus1 {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int k = 1;

        while (k <= n){
            System.out.println(k);
            k = 2 * k + 1;
        }
    }

}

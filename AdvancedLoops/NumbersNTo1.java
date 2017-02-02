package AdvancedLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 10.01.17.
 */
public class NumbersNTo1 {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());


        for (int i = n; i > 0 ; i--) {
            System.out.println(i);
        }


    }

}

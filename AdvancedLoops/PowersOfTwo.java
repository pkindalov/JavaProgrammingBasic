package AdvancedLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 10.01.17.
 */
public class PowersOfTwo {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int num = 1;

        for (int i = 0; i <= n ; i++) {
            System.out.println(num);
            num *= 2;
        }


    }

}

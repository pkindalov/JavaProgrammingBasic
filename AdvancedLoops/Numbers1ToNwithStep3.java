package AdvancedLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 10.01.17.
 */
public class Numbers1ToNwithStep3 {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());


        for (int i = 1; i <= n ; i+= 3) {
            System.out.println(i);
        }

    }

}

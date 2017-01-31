package AdvancedLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 10.01.17.
 */
public class NumberPyramid {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int num = 1;

        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                if (col > 1){
                    System.out.print(" ");
                }
                System.out.print(num);
                num++;
                if (num > n){
                    break;
                }
            }

            if (num > n){
                break;
            }
            System.out.println();
        }
    }

}

package MoreComplexConditions;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 07.01.17.
 */
public class InvalidNumber {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());
        boolean range = ((number >= 100 && number <= 200) || number == 0);

        if(!range){
            System.out.println("invalid");
        }
    }

}

package AdvancedLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 10.01.17.
 */
public class EnterEvenNumber {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        while (true){
            try{
                System.out.println("The number is not even");
                n = Integer.parseInt(console.nextLine());
                if(n % 2 == 0){
                    break;
                }

            }catch (NumberFormatException ex){
                System.out.println("Invalid number");
            }

        }

        System.out.println("Even number entered: " + n);
    }

}

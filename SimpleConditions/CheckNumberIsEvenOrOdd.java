package SimpleConditions;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 06.01.17.
 */
public class CheckNumberIsEvenOrOdd {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        if(number % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }

}

package SimpleCalculations;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 06.01.17.
 */
public class SquareArea {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int result = a * a;

        System.out.println("Square = " + result);


    }

}

package SimpleConditions;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 06.01.17.
 */
public class BiggestNumber {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter tow numbers: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        if(num1 > num2){
            System.out.println("Greater " + num1);
        }else {
            System.out.println("Greater " + num2);
        }


        System.out.println(Math.max(num1, num2));
    }

}

package SimpleConditions;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 06.01.17.
 */
public class WriteNumbersFrom0To10 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if(number == 0){
            System.out.println("Zero");
        }else if(number == 1){
            System.out.println("One");
        }else if(number == 2){
            System.out.println("Two");
        }else if(number == 3){
            System.out.println("Three");
        }else if(number == 4){
            System.out.println("Four");
        }else if(number == 5){
            System.out.println("Five");
        }else if(number == 6){
            System.out.println("Six");
        }else if(number == 7){
            System.out.println("Seven");
        }else if(number == 8){
            System.out.println("Eight");
        }else if(number == 9){
            System.out.println("Nine");
        }else if(number == 10){
            System.out.println("Ten");
        }else if(number > 10){
            System.out.println("Number too big");
        }
    }

}

package MoreComplexConditions;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 07.01.17.
 */
public class GreetingByGenderAndAge {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        double age = Double.parseDouble(console.nextLine());
        char gender = console.next().charAt(0);


        if(gender == 'f'){
            if(age < 16){
                System.out.println("Miss");
            }else {
                System.out.println("Ms.");
            }
        }else if(gender == 'm'){
            if(age < 16){
                System.out.println("Master");
            }else {
                System.out.println("Mr.");
            }
        }


    }

}

package MoreComplexConditions;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 07.01.17.
 */
public class FruitOrVegetable {

    public static void  main(String[] args){
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        if(input.equals("banana") || input.equals("apple") || input.equals("kiwi") || input.equals("cherry") || input.equals("lemon") || input.equals("grapes")){
            System.out.println("fruit");
        }else if (input.equals("tomato") || input.equals("cucumber") || input.equals("pepper") || input.equals("carrot")){
            System.out.println("vegetable");
        }else {
            System.out.println("unknown");
        }
    }

}

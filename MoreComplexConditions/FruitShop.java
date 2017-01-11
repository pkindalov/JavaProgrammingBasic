package MoreComplexConditions;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 08.01.17.
 */
public class FruitShop {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        String fruit = console.nextLine().toLowerCase();
        String day = console.nextLine().toLowerCase();
        double quantity = Double.parseDouble(console.nextLine());
        double price = -1;

        boolean isWorkDay = day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday");
        boolean isWeekDay = day.equals("saturday") || day.equals("sunday");

        if(isWorkDay){
            if (fruit.equals("banana")){
                price = 2.50;
            }else if (fruit.equals("apple")){
                price = 1.20;
            }else if (fruit.equals("orange")){
                price = 0.85;
            }else if (fruit.equals("grapefruit")){
                price = 1.45;
            }else if (fruit.equals("kiwi")){
                price = 2.70;
            }else if (fruit.equals("pineapple")){
                price = 5.50;
            }else if(fruit.equals("grapes")){
                price = 3.85;
            }
        }else if(isWeekDay) {
            if (fruit.equals("banana")){
                price = 2.70;
            }else if (fruit.equals("apple")){
                price = 1.25;
            }else if (fruit.equals("orange")){
                price = 0.90;
            }else if (fruit.equals("grapefruit")){
                price = 1.60;
            }else if (fruit.equals("kiwi")){
                price = 3.00;
            }else if (fruit.equals("pineapple")){
                price = 5.60;
            }else if(fruit.equals("grapes")){
                price = 4.20;
            }
        }

        if(price != -1){
            System.out.println(price * quantity);
        }else {
            System.out.println("error");
        }


    }

}

package SimpleConditions;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 06.01.17.
 */
public class SimpleConditionsLiveDemo {

    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        int a = 5;
        int b = 10;

        boolean result = a <= b;


//        System.out.println(a == b);
//        System.out.println(a != b);
//        System.out.println(a < b);
//        System.out.println(result);

        double grade = Double.parseDouble(console.nextLine());
        if(grade >= 5.50){
            System.out.println("Excellent!");
        }else if(grade > 5) {
            System.out.println("Very good!");
        }else {
            System.out.println("Good");
        }


        String color = "red";

        if(color.equals("red")){
            System.out.println("Tomato");
        }else if (color.equals("yellow")){
            System.out.println("banana");
            System.out.println("bye");
        }



    }

}

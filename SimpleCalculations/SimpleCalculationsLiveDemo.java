package SimpleCalculations;

import sun.applet.Main;

import java.time.DayOfWeek;
import java.util.Scanner;

/**
 * Created by r3v3nan7 on 05.01.17.
 */
public class SimpleCalculationsLiveDemo {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
//
//       int a = 5;
//       double b = 5.5;
//       String c = "Some text";
//       char symbol = 'a';
//       DayOfWeek day = DayOfWeek.FRIDAY;



//       System.out.println(a);
//       System.out.println(b);
//       System.out.println(day);
//       System.out.println(day.getClass().getName());
//
//
//       int variable = Integer.parseInt("5");
//       System.out.println(variable + 1);
//
//       int integerVariable = Integer.parseInt(scanner.nextLine());
//       System.out.println(integerVariable);
//
//       double doubleVariable = Double.parseDouble(scanner.nextLine());
//       System.out.println(doubleVariable);


//       int d = scanner.nextInt();
//       int e = scanner.nextInt();
//       scanner.nextLine();
//       String text = scanner.nextLine();
//
//       System.out.println(d);
//       System.out.println(e);
//       System.out.println(text);

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());

        double result = num1 / num2;
        System.out.println(result);


    }

}

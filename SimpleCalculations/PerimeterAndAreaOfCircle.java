package SimpleCalculations;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 06.01.17.
 */
public class PerimeterAndAreaOfCircle {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double radius = Double.parseDouble(scanner.nextLine());
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.println(area);
        System.out.println(perimeter);

    }

}

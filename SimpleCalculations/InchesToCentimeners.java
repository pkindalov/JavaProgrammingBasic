package SimpleCalculations;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 06.01.17.
 */
public class InchesToCentimeners {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double inches = Double.parseDouble(scanner.nextLine());
        double centimeters = inches * 2.54;

        System.out.println(centimeters);

    }

}

package SimpleCalculations;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 06.01.17.
 */
public class ConcatenateData {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        System.out.println("You are " + username + " " + lastName + ", a " + age +"-years old person from " + town + ".");

    }
}

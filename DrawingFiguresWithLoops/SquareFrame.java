package DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 09.01.17.
 */
public class SquareFrame {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        System.out.println("+" + repeatChars(" -", n-2) + " +");

        for (int i = 0; i < n - 2 ; i++) {
            System.out.println("|" + repeatChars(" -", n - 2) + " |" );
        }

        System.out.println("+" + repeatChars(" -", n-2) + " +");

    }


    static String repeatChars(String str, int count){
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < count ; i++) {
            newString.append(str);
        }

        return newString.toString();

    }

}

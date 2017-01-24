package DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 09.01.17.
 */
public class TriangleOfDollars {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= n ; i++) {
            System.out.println(repeat("$", i));
        }

    }


    static String repeat(String str, int count){
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < count ; i++) {
            newString.append(str);
        }

        return newString.toString();
    }

}

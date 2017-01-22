package DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 09.01.17.
 */
public class RhombusOfStars {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int spaces = n - 1;


        for (int i = 1; i <= n ; i++) {
            System.out.println(repeat(" ", spaces) + repeat("* ", i));
            spaces--;
        }

        spaces = 1;
        for (int i = n - 1; i > 0 ; i--) {
            System.out.println(repeat(" ", spaces) + repeat("* ", i));
            spaces++;
        }


    }


    static String repeat(String str, int count){
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < count ; i++) {
            newStr.append(str);
        }

        return newStr.toString();
    }
}

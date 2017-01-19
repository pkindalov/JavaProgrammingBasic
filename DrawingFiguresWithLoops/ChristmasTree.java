package DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 09.01.17.
 */
public class ChristmasTree {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i < n + 1 ; i++) {
            System.out.println(repeat(" ", n - i) + repeat("*", i) + " | " + repeat("*", i));
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

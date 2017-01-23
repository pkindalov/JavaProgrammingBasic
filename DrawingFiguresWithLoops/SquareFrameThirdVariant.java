package DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 09.01.17.
 */
public class SquareFrameThirdVariant {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int rows = 0; rows < n ; rows++) {
            if (rows == 0 || rows == n - 1){
                System.out.println("+" + repeat(" -" , n - 2) + " +");
            }else {
                System.out.println("|" + repeat(" -", n - 2) + " |");
            }
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

package DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 10.01.17.
 */
public class Diammond {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int leftRigt = (n - 1) / 2;

        for (int i = 0; i <= (n - 1) / 2 ; i++) {
            System.out.print(repeat("-", leftRigt) + "*");

            int middleDashes = (n - 2) - (leftRigt * 2);
            if (middleDashes >= 0){
                System.out.print(repeat("-", middleDashes) + "*");
            }

            System.out.println(repeat("-", leftRigt));
            leftRigt--;
        }


        leftRigt = 1;
        for (int i = 0; i < (n - 1) / 2 ; i++) {
            System.out.print(repeat("-", leftRigt) + "*");

            int middleDashes = (n - 2) - (leftRigt * 2);
            if (middleDashes >= 0){
                System.out.print(repeat("-", middleDashes) + "*");
            }

            System.out.println(repeat("-", leftRigt));
            leftRigt++;
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

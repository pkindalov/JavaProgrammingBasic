package ExamPrepProgrammBasicsExam28August2016;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 16.01.17.
 */
public class Axe {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int totalSymbolsPerRow = n * 5;
        int leftPartDots = n * 3;
        int rightPartDots = totalSymbolsPerRow - leftPartDots - 2;
        int middleDots = 0;
        int middleStars = 2;
        int currentRightDots = 0;
        int currentMiddleDots = 0;
        int handleOfAxe = n / 2;
        int rowsAfterHandleBeforLastRow = (n / 2) - 1;
        int leftDotsFinalRow = leftPartDots - rowsAfterHandleBeforLastRow;
        int starsFinalRow = totalSymbolsPerRow - leftDotsFinalRow;

        //drawing first n rows of axe or first part of draw
        for (int i = 0; i < n ; i++) {
            System.out.print(repeat("-", leftPartDots));
            System.out.printf("*" + repeat("-", middleDots) + "*");
            System.out.printf(repeat("-", rightPartDots));
            System.out.println();
            currentMiddleDots = middleDots;
            middleDots++;
            currentRightDots = rightPartDots;
            rightPartDots--;

        }


        //now drawing handle of axe
        for (int i = 0; i < handleOfAxe ; i++) {
            System.out.printf(repeat("*", leftPartDots) + "*");
            System.out.printf(repeat("-", currentMiddleDots) + "*");
            System.out.printf(repeat("-", currentRightDots));
            System.out.println();
        }


        //now drawing rows between hangle and last row..
        for (int i = 0; i < rowsAfterHandleBeforLastRow ; i++) {
            System.out.printf(repeat("-", leftPartDots) + "*");
            System.out.printf(repeat("-", currentMiddleDots) + "*");
            System.out.printf(repeat("-", currentRightDots));
            System.out.println();
            leftPartDots--;
            currentRightDots--;
            currentMiddleDots += 2;
        }



        //now drawing final row
        int stars = starsFinalRow - currentRightDots;

        System.out.print(repeat("-", leftDotsFinalRow));
        System.out.printf(repeat("*", stars));
        System.out.printf(repeat("-", currentRightDots));
        System.out.println();



    }





    public static String repeat(String str, int count){
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < count ; i++) {
            newStr.append(str);
        }

        return newStr.toString();

    }

}

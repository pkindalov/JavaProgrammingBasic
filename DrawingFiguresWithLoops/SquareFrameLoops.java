package DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 09.01.17.
 */
public class SquareFrameLoops {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        //drawing roof
        System.out.print("+");
        for (int i = 0; i < n - 2 ; i++) {
            System.out.print(" -");
        }
        System.out.println(" +");


        //drawing body of square
        for (int bodyRows = 0; bodyRows < n - 2 ; bodyRows++) {
            System.out.print("|");
            for (int cols = 0; cols < n -2 ; cols++) {
                System.out.print(" -");
            }
            System.out.print(" |");
            System.out.println();
        }



        //drawing ceiling
        System.out.print("+");
        for (int i = 0; i < n - 2 ; i++) {
            System.out.print(" -");
        }
        System.out.println(" +");


    }
}
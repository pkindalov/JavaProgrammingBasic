package DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 09.01.17.
 */
public class RectangleOfNxNStarsNestedLoops {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i < n ; i++) {

            for (int j = 0; j < n ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}

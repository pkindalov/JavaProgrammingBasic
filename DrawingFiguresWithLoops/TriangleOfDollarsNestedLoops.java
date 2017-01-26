package DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 09.01.17.
 */
public class TriangleOfDollarsNestedLoops {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int cols = 1; cols <= n ; cols++) {
            for (int rows = 0; rows < cols ; rows++) {
                System.out.print("$");
            }
            System.out.println();
        }

    }

}

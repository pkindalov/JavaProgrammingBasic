package DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 09.01.17.
 */
public class RectangleOfNxNStars {

    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        int numberOfRepeat = Integer.parseInt(console.nextLine());

        for (int i = 0; i < numberOfRepeat ; i++) {
            System.out.println(repeat("*", numberOfRepeat));
        }


    }


    static String repeat(String str, int count){
        StringBuilder strBuild = new StringBuilder();

        for (int i = 0; i < count ; i++) {
            strBuild.append(str);
        }

        return strBuild.toString();

    }

}

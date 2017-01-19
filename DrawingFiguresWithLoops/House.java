package DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 09.01.17.
 */
public class House {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int roofRows = 0;
        int bodyRows = 0;
        int star = 0;
        int dots = 0;

        if(n % 2 == 0){
            roofRows = n / 2;
            bodyRows = n / 2;
            star = 2;
            dots = (n - star) / 2;
        }else {
            roofRows = (n + 1) / 2;
            bodyRows = n / 2;
            star = 1;
            dots = (n - star) / 2;
        }


        //drawing roof
        for (int i = 0; i < roofRows ; i++) {
            System.out.println(repeat("_", dots) + repeat("*", star) + repeat("_", dots));
            dots--;
            star += 2;
        }


        //drawing body of house
        star = n - 2;
        for (int i = 0; i < bodyRows ; i++) {
            System.out.println("|" + repeat("*", star) + "|");
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

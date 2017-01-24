package DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 09.01.17.
 */
public class Sunglasses {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        System.out.println(repeatStr("*", n * 2) + repeatStr(" ", n) + repeatStr("*", n * 2));

        for (int i = 0; i < n - 2 ; i++) {
            System.out.print("*" + repeatStr("/", (n * 2) - 2) + "*");
            if(i != (n - 1) / 2 - 1){
                System.out.print(repeatStr(" ", n));
            }else {
                System.out.print(repeatStr("|", n));
            }

            System.out.println("*" + repeatStr("/", (n * 2) - 2) + "*");
        }

        System.out.println(repeatStr("*", n * 2) + repeatStr(" ", n) + repeatStr("*", n * 2));


    }

    static String repeatStr(String str, int count){
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < count ; i++) {
            newStr.append(str);
        }

        return newStr.toString();
    }

}

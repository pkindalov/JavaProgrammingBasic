package Loops;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by r3v3nan7 on 08.01.17.
 */
public class VowelsSumSecondWay {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        String word = console.nextLine();
        int sum = 0;

        for (int i = 0; i < word.length() ; i++) {
            char currentLetter = word.charAt(i);

            switch (currentLetter){
                case 'a':
                case 'e':
                case 'i':
                case  'o':
                case  'u':
                    sum ++;
            }

        }


        System.out.println(sum);


    }

}

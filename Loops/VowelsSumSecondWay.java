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
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case  'o':
                    sum += 4;
                    break;
                case  'u':
                    sum += 5;
                    break;
            }

        }


        System.out.println(sum);

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(2.50));

    }

}

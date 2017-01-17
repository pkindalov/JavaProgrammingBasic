package Loops;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 08.01.17.
 */
public class VowelsSum {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        String word = console.nextLine();
        int sum = 0;

        for (int i = 0; i < word.length() ; i++) {
//            System.out.println(word.charAt(i));
            if(word.charAt(i) == 'a'){
                sum += 1;
            }else if (word.charAt(i) == 'e'){
                sum += 2;
            }else if (word.charAt(i) == 'i'){
                sum += 3;
            }else if (word.charAt(i) == 'o'){
                sum += 4;
            }else if (word.charAt(i) == 'u'){
                sum += 5;
            }

        }

        System.out.println(sum);

        //System.out.println(word.charAt(0));

    }

}

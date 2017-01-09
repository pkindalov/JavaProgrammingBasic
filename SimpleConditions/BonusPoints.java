package SimpleConditions;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 06.01.17.
 */
public class BonusPoints {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double bonusScore = 0;

        if(num <= 100){
            bonusScore = 5;
        }else if (num > 1000){
            bonusScore = num * 0.1;
        }else if(num > 100){
            bonusScore = num * 0.2;
        }

        if(num % 2 == 0){
            bonusScore++;
        }else if(num % 10 == 5){
            bonusScore += 2;
        }

        System.out.println(bonusScore);
        System.out.println(num + bonusScore);


    }

}

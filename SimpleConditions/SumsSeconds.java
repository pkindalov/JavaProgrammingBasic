package SimpleConditions;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 06.01.17.
 */
public class SumsSeconds {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int sec = Integer.parseInt(scanner.nextLine());
        int sec2 = Integer.parseInt(scanner.nextLine());
        int sec3 = Integer.parseInt(scanner.nextLine());

        int secs = sec + sec2 + sec3;
        int mins = 0;

        if(secs > 59){
            mins++;
            secs -= 60;
        }

        if(secs > 59){
            mins++;
            secs -= 60;
        }

        if(secs > 59){
            mins++;
            secs -= 60;
        }


        if(secs < 10){
            System.out.println(mins + ":" + "0" +secs);
        }else {
            System.out.println(mins + ":" + secs);
        }


    }

}

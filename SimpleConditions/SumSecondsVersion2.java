package SimpleConditions;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 07.01.17.
 */
public class SumSecondsVersion2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int sec1 = Integer.parseInt(scanner.nextLine());
        int sec2 = Integer.parseInt(scanner.nextLine());
        int sec3 = Integer.parseInt(scanner.nextLine());

        int totalSeconds = sec1 + sec2 + sec3;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%d:%02d", minutes, seconds);

    }

}

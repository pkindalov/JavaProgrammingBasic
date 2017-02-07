package ExamPrepProgrammBasicsExam28August2016;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 12.01.17.
 */
public class Bussiness {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        int necessairyHours = Integer.parseInt(console.nextLine());
        int deadlineDays = Integer.parseInt(console.nextLine());
        int employeesWorksOvertime = Integer.parseInt(console.nextLine());

        double hoursForTraining = deadlineDays - (0.1 * deadlineDays);
        double hoursForWorks = hoursForTraining * 8;
        int hoursFromEmplWorkOvertime = employeesWorksOvertime * (2 * deadlineDays);
        int totalHours = (int)hoursForWorks + hoursFromEmplWorkOvertime;
        int hoursDifference = 0;

        if(totalHours >= necessairyHours){
            hoursDifference = totalHours - necessairyHours;
            System.out.println("Yes!" + hoursDifference + " hours left.");
        }else {
            hoursDifference = Math.abs(totalHours - necessairyHours);
            System.out.println("Not enough time!" + hoursDifference + " hours needed.");
        }


    }

}

package ExamPrepProgrammBasicsExam28August2016;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 12.01.17.
 */
public class Hospital {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        int days = Integer.parseInt(console.nextLine());
        int doctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for (int i = 1; i <= days ; i++) {
            int patients = Integer.parseInt(console.nextLine());

            if(i % 3 == 0){

                if(treatedPatients < untreatedPatients)
                    doctors++;

            }

            if(doctors == patients){
                treatedPatients += patients;
            }else if(doctors > patients){
                treatedPatients += patients;
            }else {
                untreatedPatients += patients - doctors;
                treatedPatients += doctors;
            }



        }

        System.out.println("Treated patients: " + treatedPatients + ".");
        System.out.println("Untreated patients: " + untreatedPatients + ".");

    }

}

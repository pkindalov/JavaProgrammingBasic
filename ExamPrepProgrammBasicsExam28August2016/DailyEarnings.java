package ExamPrepProgrammBasicsExam28August2016;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 12.01.17.
 */
public class DailyEarnings {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        int workingDaysInMonth = Integer.parseInt(console.nextLine());
        double earningsPerDay = Double.parseDouble(console.nextLine());
        double dollar = Double.parseDouble(console.nextLine());

        double earnedMoneyPerMonth = workingDaysInMonth * earningsPerDay;
        double yearEarnedMoney = (earnedMoneyPerMonth * 12) + (earnedMoneyPerMonth * 2.5);
        double taxes = 0.25 * yearEarnedMoney;
        double yearIncome = (yearEarnedMoney- taxes) * dollar;
        double dayIncome = yearIncome / 365;



        System.out.printf("%.2f", dayIncome);


    }

}

package ExamPrepProgrammBasicsExam28August2016;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 12.01.17.
 */
public class HotelRoom {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        String month = console.nextLine().toLowerCase();
        int nights = Integer.parseInt(console.nextLine());

        double studioPrice = 0;
        double studioReduction = 0;
        double apartmentPrice = 0;
        double apartmenReduction = 0;



        double totalPriceStudio = 0;
        double totalPriceApartment = 0;



        switch (month){
            case "may":
            case "october":
                studioPrice = 50;
                apartmentPrice = 65;
                if(nights > 7 && nights <= 14){
                    studioReduction = 0.05;
                }else if (nights > 14){
                    studioReduction = 0.3;
                    apartmenReduction = 0.1;
                }
                break;
            case "june":
            case "september":
                studioPrice = 75.20;
                apartmentPrice = 68.70;
                if(nights > 14){
                    studioReduction = 0.2;
                    apartmenReduction = 0.1;
                }
                break;
            case "july":
            case "august":
                studioPrice = 76;
                apartmentPrice = 77;
                if(nights > 14){
                    apartmenReduction = 0.1;
                }
                break;
        }

        totalPriceStudio = (studioPrice - (studioReduction * studioPrice)) * nights;
        totalPriceApartment = (apartmentPrice - (apartmenReduction * apartmentPrice)) * nights;

        System.out.printf("Apartment: %.2f lv.%n", totalPriceApartment);
        System.out.printf("Studio: %.2f lv.%n", totalPriceStudio);



    }

}

package MoreComplexConditions;

import java.util.Scanner;

/**
 * Created by r3v3nan7 on 08.01.17.
 */
public class TradeComissions {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        String city = console.nextLine().toLowerCase();
        double sales = Double.parseDouble(console.nextLine());
        double commission = -1;

        boolean lowInterval = sales >= 0 && sales <= 500;
        boolean mediuminterval = sales > 500 && sales <= 1000;
        boolean highInterval = sales > 1000 && sales <= 10000;
        boolean veryHighInterval = sales > 10000;

        if(city.equals("sofia")){
            if(lowInterval){
                commission = 0.05;
            }else if (mediuminterval){
                commission = 0.07;
            }else if (highInterval){
                commission = 0.08;
            }else if (veryHighInterval){
                commission = 0.12;
            }
        }else if (city.equals("varna")){
            if(lowInterval){
                commission = 0.045;
            }else if (mediuminterval){
                commission = 0.75;
            }else if (highInterval){
                commission = 0.10;
            }else if (veryHighInterval){
                commission = 0.13;
            }
        }else if(city.equals("plovdiv")){
            if(lowInterval){
                commission = 0.055;
            }else if (mediuminterval){
                commission = 0.08;
            }else if (highInterval){
                commission = 0.12;
            }else if (veryHighInterval){
                commission = 0.145;
            }
        }

        if (commission != -1){
            System.out.printf("%.2f", commission * sales);
        }else {
            System.out.println("error");
        }

    }

}



package Loops;

/**
 * Created by r3v3nan7 on 08.01.17.
 */
public class NumbersEndingIn7 {

    public static void main(String[] args){
        for (int i = 1; i <= 1000 ; i++) {
            if(i % 10 == 7){
                System.out.println(i);
            }
        }
    }

}

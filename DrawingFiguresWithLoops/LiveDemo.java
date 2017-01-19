package DrawingFiguresWithLoops;

/**
 * Created by r3v3nan7 on 08.01.17.
 */
public class LiveDemo {

    public static void main(String[] args){
        //System.out.println(repeatStr("xa", 5));
        String repeatedStr = repeatStr("xa", 3);

        System.out.println(repeatedStr);

    }

    static String repeatStr(String str, int count){
        //String repeated = "";
        StringBuilder repeated = new StringBuilder();



        for (int i = 0; i < count; i++) {
//            repeated += str;
              repeated.append(str);
        }

        return repeated.toString();

    }


}

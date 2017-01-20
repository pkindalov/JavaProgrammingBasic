package DrawingFiguresWithLoops;

/**
 * Created by r3v3nan7 on 09.01.17.
 */
public class RectangleOf10x10Stars {

    public static void main(String[] args){

        for (int i = 0; i < 10 ; i++) {
            System.out.println(repeatChars("*", 10));
        }



    }



    static String repeatChars(String str, int count){
        StringBuilder strBuildier = new StringBuilder();

        for (int i = 0; i < count ; i++) {
            strBuildier.append(str);
        }

        return strBuildier.toString();

    }

}

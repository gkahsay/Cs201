package FirstName;

import java.text.DecimalFormat;
import java.util.Random;

public class Guess {
    public static void main(String[]args){
        double num = 123.345096;
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(num));
        Random ra =new Random();
        int number = ra.nextInt(11);
    }
}

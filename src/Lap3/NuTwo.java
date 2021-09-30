package Lap3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NuTwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Enter any number in centimeters");
        double cm = input.nextDouble();
        double inches =0.3937 * cm;
        double feet = 0.0328 * cm;
       System.out.println("Feet ="+ feet);
        System.out.println("Inches = "+ inches);
        System.out.print(df.format(feet)+"feets and " );
        System.out.println(df.format(inches)+ "inches");

    }
}

package Lap3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NuOneB {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println("Enter any number for X and Y separately:");
        double X =input.nextDouble();
        double Y =input.nextDouble();
        double res =X + 4*Y*Y*Y;
        double res1 =Math.sqrt(res);
        System.out.println("Res="+ res);
       // System.out.println(Math.sqrt(res));
        System.out.println(df.format(res1));

    }
}

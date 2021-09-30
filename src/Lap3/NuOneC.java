package Lap3;

import java.util.Scanner;

public class NuOneC {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter any number for X and Y separately");
       double X = input.nextDouble();
       double Y = input.nextDouble();
       double res =Math.cbrt(X*Y);
       System.out.println("Res=="+res);
    }
}

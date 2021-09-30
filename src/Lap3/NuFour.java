package Lap3;

import java.util.Scanner;

public class NuFour {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.println("Enter your body weight:");
     double bodyWeight = input.nextDouble();
     double calories = bodyWeight * 19;
     System.out.println("Calories needs in one day="+ calories);
    }
}

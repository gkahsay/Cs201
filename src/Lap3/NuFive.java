package Lap3;

import java.util.Scanner;

public class NuFive {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the year you born:");
      double yearBorn =input.nextDouble();
      double thisYear =input.nextDouble();
      int age = (int) thisYear - (int)yearBorn;
      System.out.println("You were born in "+ yearBorn + " and will be "+ age +" this year." );

    }
}

package Lap3;

import java.util.Scanner;

public class NuThree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temperature in degree celsius ");
        double Celsius = input.nextDouble();
        double Fahrenheit = 1.8 * Celsius + 32;
        System.out.println("Fahrenheit= "+ Fahrenheit);
    }
}

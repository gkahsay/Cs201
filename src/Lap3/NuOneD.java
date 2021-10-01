package Lap3;

import java.util.Scanner;

public class NuOneD {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number for radius:");
        double R = input.nextDouble();
        double res =  Math.PI *R*R;
        System.out.println("Res="+ res);
    }
}

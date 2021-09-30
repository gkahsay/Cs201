package Lap3;

import java.util.Scanner;

public class NuOneA {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number for A, B and C separetly ");
        double A =input.nextDouble();
        double B =input.nextDouble();
        double C =input.nextDouble();
        Double res = B*B + 4*A*C;
        System.out.println("Res= " + res);
        System.out.println(Math.sqrt(res));
    }
}

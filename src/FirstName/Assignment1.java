package FirstName;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter first, middile and last name Separatly:");
        String fName =input.nextLine();
        String middile =input.nextLine();
        String lName = input.nextLine();
        System.out.print(fName);
        System.out.print(" "+middile.charAt(0)+".");
        System.out.println(" "+lName);

    }
}

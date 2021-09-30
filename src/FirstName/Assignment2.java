package FirstName;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Stiring");
        String str =input.nextLine();
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.substring(str.length()-1));
    }
}

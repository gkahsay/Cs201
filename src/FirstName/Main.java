package FirstName;

import java.util.Scanner;

public class Main {
    public static void main(String[] arrgs){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first and last name");
        String fName = input.next();
        String lName = input.next();
        System.out.print(fName.substring(0,1));
        System.out.println(lName.substring(0,1));
        System.out.println(fName.charAt(0)+""+lName.charAt(0));


    }

}

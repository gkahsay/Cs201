package FirstName;

import java.util.Random;
import java.util.Scanner;

public class RandomForLoop {
    public static void main(String[] args){
        //display the two dice using for loop through n times
        Scanner input = new Scanner(System.in);
       Random r = new Random();
       System.out.println("Enter the number of rolling:");
       int userInput =input.nextInt();
       for(int i=0;i<userInput;i++){
           int dice1 = r.nextInt(6)+1;
           int dice2 = r.nextInt(6)+1;
           System.out.println("("+dice1+","+dice2+","+")");
       }
    }
}

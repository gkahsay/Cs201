package FirstName;

import java.util.Random;
import java.util.Scanner;

public class RandomMethod {
   static Random random =new Random();
   //static is using  same or constant for all methes
    public static void main(String[] args){
        //diplay the random number of rolling two dice by creating methods

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rolling");
        int userInput = input.nextInt();
        rollDice(userInput);
    }
    public static void rollDice(int numberRolling){
        for(int i=0;i<numberRolling;i++){
            int dice1=random.nextInt(6)+1;
            int dice2=random.nextInt(6)+1;
            System.out.println("("+ dice1 +","+ dice2 + ")");
        }
    }
}

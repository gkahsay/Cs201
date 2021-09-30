package FirstName;

import java.util.Random;

public class RandomDice{
    public static void main(String[] args){
    /*print the random number if you through two
        dice with six faces at the same time.*/
      Random ran = new Random();
      int dice1 = ran.nextInt(6 -1 +1)+1;
      //we add 1 to make the random number from 1 to 6
      int dice2 = ran.nextInt(6)+1;
      System.out.println("(" + dice1 +","+ dice2+")");
    }
}

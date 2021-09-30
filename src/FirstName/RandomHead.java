package FirstName;

import java.util.Random;
//dispaly a random dice with head and tails
public class RandomHead {
    public static void main(String[] args){
        Random random = new Random();
        for(int i=0;i<5;i++){
            int num = random.nextInt(101)+1;
            System.out.println(num>=50 ? "Head" : "Tails");
        }
    }
}

package FirstName;

import java.util.Random;

public class RandomDemo {
    public static void main(String[]args){
        Random random =new Random();

        for(int i=0;i<5;i++){// print the max from 20 and min 10
            //int r =random.nextInt(12);
            // (max-min+1)+min
            // i = how many times the numbers out
            /*max and min =the numbers will out between
            max and min for i times.
            */
            int r =random.nextInt(20-10+1)+10;
            System.out.println(r);

        }


    }
}


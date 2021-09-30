package FirstName;

import java.util.Random;

public class Dies {
    public static void main(String[] args){
        Random random = new Random();

        for(int i =0;i<2;i++){
            int r =random.nextInt(6)+1;
            System.out.println(r);

        }
    }
}

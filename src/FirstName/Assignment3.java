package FirstName;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word with characters:");
        String word = input.next();
            System.out.println(word.substring(word.length()/2,word.length()/2+1));
        }
    }


/*
 Hamilton Nguyen 1000538439 06/06/2018

Problem 3 

 */

import java.util.Scanner;
        
public class info {

    public static void main(String[] args) {
       
        Scanner input=new Scanner (System.in);
        
        System.out.println("Enter your name:");
        String Name=input.next();
        
        System.out.println("Enter your age:");
        int n=input.nextInt();
        
        input.nextLine();
        
        System.out.println("Enter your favorite food:");
        String Food=input.next();
        
        int n1=2;
        int n2=n+n1;

        System.out.printf("\nMy name is: %s and my favorite food is %s!\n***\nI am"
                + " %d years old and in %d years I will be %d!\n", Name, Food, n, n1, n2);
    
    }
    
}

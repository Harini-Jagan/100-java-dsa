//package day6;

import java.util.Scanner;
public class prob16 {
    public static void main(String[] args) {
        //amstrong number
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int original=num;
        int sum=0;
        while(num>0){
             int digit=num%10;
              sum=sum+(digit*digit*digit);
              num=num/10;
        }
        if(sum==original){
            System.out.println(original + " is an Amstrong number");
        }
        else{
            System.out.println(original + " is not an Amstrong number");

        }
        
        sc.close();
    
    }
}

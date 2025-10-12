package day2;

import java.util.Scanner;
public class prob8 {
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.print("Enter a name: " );
   // char a=scn.next().trim().charAt(2);
    String b=scn.nextLine().trim(); //trim actually use to remove extra spaces
   // System.out.println(a);
    System.out.println(b);

    scn.close();
    }    
}

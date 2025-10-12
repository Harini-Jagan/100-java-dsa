package day2;
import java.util.Scanner;
public class prob7 {
    public static void main(String[] args) {
        System.out.println("Enter a number for a,b,c : ");
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();

        int max=Math.max(c,Math.max(a,b));
        System.out.println( max );
        
        scn.close();
    }
    
}

        


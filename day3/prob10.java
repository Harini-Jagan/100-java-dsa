package day3;
import java.util.Scanner;
public class prob10 {
    public static void main(String[] args) {
        //alphabet case
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a Alphabet: ");
        char ch=scn.next().charAt(0);
        if(ch>'a' && ch<'z'){
            System.out.println("Lowercase");
        }
        else{
             System.out.println("Uppercase");

        }
        scn.close();
        
    }
    
}

package day3;
import java.util.Scanner;
public class prob11 {
    public static void main(String[] args) {
        //fibonacci series
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int a=0;
        int b=1;
        int count=2;
        while (count<=n) {
          int temp=b;
            b=b+a;
            a=temp;
            count++;
            
        }
        System.out.println(b);
        scn.close();
    }
}

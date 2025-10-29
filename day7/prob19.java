package day7;
import java.util.Scanner;
import java.util.Arrays;
public class prob19 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a text : ");
        String[] arr=new String[5];
        for(int i=0;i<arr.length;i++){
        arr[i]=sc.next();
    }
        System.out.println(Arrays.toString(arr));
        //modify
        arr[2]="hi";
        System.out.println("The modify content of the String is " + Arrays.toString(arr));


        sc.close();

    } 
    
}

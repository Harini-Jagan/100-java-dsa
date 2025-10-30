package day8;
import java.util.Scanner;
public class prob21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int[][] arr=new int[3][2];
        //arr.length=3*3=9
        System.out.println(arr.length);
      
        //input from the user
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //output 
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                
                System.out.print(arr[i][j] + " ");
            }
                 System.out.println();

        }
           
          sc.close();

        
    }
    
}

 package day2;
 
 import java.util.Scanner;
public class prob6 {
    public static void main(String[] args) {
        Scanner san=new Scanner(System.in);
        System.out.print("Enter a Mark: ");
        int mark=san.nextInt();
        if(mark<=35){
            System.out.println("Fail");
        }
        else if(mark>=35 && mark<=100){
            System.out.println("pass");
            
        }
        else{
            System.out.println("Not a mark");
        }
        san.close();
    }

    
}

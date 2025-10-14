package day4;

public class prob12 {
    public static void main(String[] args) {
        int a=12323432;
        int b=0;
        while(a>0){
           int rem=a %10; 
           a=a/10;
           b=b*10+rem;

        }
        System.out.println(b);

        
    }
    
}

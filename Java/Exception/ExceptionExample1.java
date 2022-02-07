package Exception;
import java.util.*;
public class ExceptionExample1 {
    public static void main(String[] args){
        System.out.println("Enter the number : " );
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        try{
            System.out.println("Answer : "+100/data);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
    

    
}

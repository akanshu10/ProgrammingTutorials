package PatternPrinting;
import java.util.*;
public class OneLine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number : ");
        num=sc.nextInt();
        for (int i=0;i<num;i++){
            System.out.print(i+ " ");
        }
    }
    
}

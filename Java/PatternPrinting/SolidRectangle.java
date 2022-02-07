package PatternPrinting;
import java.util.*;
public class SolidRectangle {
    public static void main(String[] args){
        int num;
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(int i=0;i<num-2;i++){
            for(int j=0;j<num;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

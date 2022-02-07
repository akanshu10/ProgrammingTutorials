package PatternPrinting;
import java.util.*;
public class PrintA {
    public static void main(String[] args){
        int rows,cols;
        Scanner sc = new Scanner(System.in);
        //rows = sc.nextInt();
        //cols = sc.nextInt();
        for(int i=0;i<10;i++){
            for(int j=0;j<6;j++){
                if(!(i<2)){
                    if(j<2||j>=4){
                        System.out.print("* ");
                    }else if(i>=4&&i<=5){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                else if(i==j||j==5-i){
                    System.out.print("  ");
                }
                else
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}

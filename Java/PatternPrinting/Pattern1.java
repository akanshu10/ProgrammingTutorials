package PatternPrinting;
import java.util.*;
public class Pattern1 {
    public static void main(String[] args){
        int num,len;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num=sc.nextInt();
        len=2*num-1;
        int min;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(i<j){
                    min=i;
                }else{
                    min=j;
                }
                if(min<len-i){
                    min=min;
                }else{
                    min=len-i-1;
                }if(min<len-j-1){
                    min=min;
                }else{
                    min=len-j-1;
                }
                System.out.print(num-min+" ");
            }
            System.out.println();
        }

    }
    
}

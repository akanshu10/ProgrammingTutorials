import java.lang.reflect.Array;
import java.util.Scanner;

public class multiplies {
    public static void main(String[] args){
        int num,i,j=0;
        int[] Mul=new int[20];
        System.out.println("Enter the number for multiplies :");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        i=num;
        while(i>0){
            if(num%i==0){
                Mul[j]=i;
                j++;
            }
            i--;
        }
        System.out.println("Multiplies of "+num+" :");
        for(int k=j-1;k>=0;k--){
           System.out.print(Mul[k]);
           if(Mul[k]!=num)
           System.out.print("x");
        }
    }
}

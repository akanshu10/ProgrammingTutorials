package Permutation;
import java.util.*;
//import Permutation.*;
public class AtLeastTimeTakenPermutation {
    public static int atLeastPermutation(int n,int r){
        int sum=0;
        for(int i=r;i<=n;i++){
            sum=sum+Permutation.permutation(n, i);
        }
        return sum;
    }
    public static void main(String[] args){
        int num,r,P;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of permutation : ");
        num=sc.nextInt();
        System.out.println("Enter the r : ");
        r = sc.nextInt();
        P=atLeastPermutation(num, r);
        System.out.println("Result : "+P);
    }
    
}

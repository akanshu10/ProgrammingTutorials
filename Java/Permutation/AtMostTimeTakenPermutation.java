package Permutation;
//Number of Permutation of N different thing taken at most r at a time.
//nP1+nP2+nP3+...+nPr
import java.util.*;
public class AtMostTimeTakenPermutation {
    public static int atmostPermutaion(int n,int r){
        int sum=0;
        for(int i=1;i<=r;i++){
            sum=sum+Permutation.permutation(n, i);
        }
        return sum;
    }
    public static void main(String[] args){
        int num,r,P;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of permutation : ");
        num = sc.nextInt();
        System.out.println("Enter the number of things taken : ");
        r = sc.nextInt();
        P=atmostPermutaion(num, r);
        System.out.println("Result: "+P);
    }
    
}

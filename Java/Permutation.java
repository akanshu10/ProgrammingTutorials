import java.util.*;
public class Permutation {
    public static int permutation(int n,int r){
        if(n<r){
            return -1;
        }
        if(n==r){
            return Factorial.fact(n);
        }
        return (Factorial.fact(n)/(Factorial.fact(n-r)));
    }

    public static void main(String[] args){
        int num,r,P;
        System.out.println("Enter the value of n : ");
        
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Enter the value of r : ");
        r = sc.nextInt();
        P=permutation(num, r);
        if(P>0)
        System.out.println("Permutation of "+num+" and "+r+" is : "+P);
        else
        System.out.println("N never less than r in Permutation. Please Insert again... ");
    }
    
}

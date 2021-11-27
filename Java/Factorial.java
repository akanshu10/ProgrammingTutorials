import java.util.*;
public class Factorial {
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args){
        int num,factorial;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for factorial : ");
        num = sc.nextInt();
        factorial=fact(num);
        System.out.println("Factorial of the number : "+factorial);

    }
    
}

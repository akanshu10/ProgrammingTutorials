import java.util.Scanner;
import java.lang.Math;
public class PrimeNumber1 {

    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [50];
        int flag;
        int num = sc.nextInt();
        int k=0;
        int root_num = (int)Math.sqrt(num);

        for(int i =2;i<=num;i++){
            flag = 1;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=0;
                }
            }
            if(flag ==1){
                
                arr[k++]=i;
            }
        }
    }
    
}

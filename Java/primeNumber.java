import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args){
        int num,flag,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        num=sc.nextInt();
        for(int i=2;i<=num;i++){
            flag=1;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                   flag=0;
                }
            }
            if(flag==1){
                count++;
            System.out.print(i+" ");
            }
        }
        System.out.println("");
        System.out.println(count);
        }
    }


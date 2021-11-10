import java.util.Scanner;

public class primefactor {
    public static void main(String[] args){
        int flag;
        int[] arr=new int[50];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for prime factorism :");
        int num=sc.nextInt();
        int temp_num=num;
        int k=1;
        arr[0]=1;
        for(int i=2;i<=num;i++){
            flag=1;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=0;
                }
            }
            if(flag==1){
                arr[k]=i;
                k++;
                
            }
        }
        
        int j=1;
        k=0;
        int count=0;
        int[] arr1 =new int[50];
        while(temp_num>1){
            if(temp_num%arr[j]==0){
                arr1[k]=arr[j];
                k++;count++;
                temp_num=temp_num/arr[j];

            }else{
                j++;
            }
        }
        System.out.println("Prime factor of the number :");
        for(int i=0;i<count;i++){
            System.out.print(arr1[i]);
            if(i+1!=count){
                System.out.print(" x ");
            }
        }
    }
}

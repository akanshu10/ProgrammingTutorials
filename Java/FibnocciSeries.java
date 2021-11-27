import java.util.*;
public class FibnocciSeries {
    public static void main(String[] args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for fibnacci :");
        num=sc.nextInt();
        int n1=0,n2=0,n3;
        for(int i=0;i<num;i++){
            if(i==0)
            n1=0;
            if(i==1)
            n2=1;
            else if(i>1){
                n3=n1+n2;
                n1=n2;
                n2=n3;
                System.out.print(n3+" ");
            }
        }
    }
}

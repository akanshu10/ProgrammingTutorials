import java.util.Scanner;

class digitalsum{
    public static void main(String[] args){
        int num,digitalsum=0,additive_presedense=1;
        Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number for digital sum :");
    num=sc.nextInt();
    while(num>0 || digitalsum>=10){
        digitalsum=digitalsum+num%10;
        num=num/10;
        if(num==0 && digitalsum>=10){
            num=digitalsum;
            digitalsum=0;
            additive_presedense++;
        }
    }
    System.out.println("Digital sum :"+digitalsum);
    System.out.println("Additive Presedence :"+additive_presedense);
    }

}
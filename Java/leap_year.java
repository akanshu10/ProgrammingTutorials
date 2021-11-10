import java.util.Scanner;

class leap_year{
    public static void main(String[] args){
        int leap_year;
        System.out.println("Enter the year :");
        Scanner sc=new Scanner(System.in);
        leap_year=sc.nextInt();
        if(leap_year%400==0){
            System.out.println("Entered year "+leap_year+" is a leap year");
        }
        else if(leap_year%100==0){
            System.out.println("Entered year "+leap_year+" is not a leap year");
        }
        else if(leap_year%4==0){
            System.out.println("Entered year "+leap_year+" is a leap year");
        }
        else{
            System.out.println("Entered year "+leap_year+" is not a leap year");
        }
    }
}
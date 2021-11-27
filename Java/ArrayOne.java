import java.util.*;
class ArrayOne{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<5;i++){
        for(int j=0;j<4;j++){
            if(i==0 || i==2)
            if((i==0 &&j==0)||(i==0&&j==3))
            System.out.print(" ");
            else
            System.out.print("*");
            else{
                if(j==0 ||j==3)
                System.out.print("*");
                else
                System.out.print(" ");
            }
        }
        System.out.println();
        }
    }
}
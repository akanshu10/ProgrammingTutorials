import java.util.*;
public class Table {
    public static void main(String[] args){
        int num;
        System.out.println("Enter the number for table :");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int table[][] =new int[num][10];
        for(int i=0;i<num;i++){
            for(int j=0;j<10;j++){
                table[i][j]=(i+1)*(j+1);
                System.out.print(table[i][j]+"\t");
            }
            System.out.println();
            
        }
    }
    
}

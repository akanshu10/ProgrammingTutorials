public class pattern2 {
    public static void main(String[] args){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if((i==0&&j==1) ||(i==2&&j==1))
                System.out.print("*");
                else
                System.out.print(" ");
                if(i==1)
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

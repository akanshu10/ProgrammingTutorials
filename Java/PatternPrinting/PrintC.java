package PatternPrinting;

public class PrintC {
    public static void main(String[] args){
    for(int i=0;i<10;i++){
        for(int j=0;j<6;j++){
            if((i>1&&i<8)&&(j>1)){
                System.out.print("  ");
            }else{
                
            }
            System.out.print("* ");
        }
        System.out.println();
    }
}
}

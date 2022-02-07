package PatternPrinting;

public class PrintB {
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            for(int j=0;j<6;j++){
                if(!(i<2)){
                    if(j<2||j>=4){
                        if(i==9&&j==5){
                            System.out.print("  ");
                        }else if((i>=4&&i<=5)&&j==4){
                                System.out.print(" ");
                        }
                        else{
                            System.out.print("* ");
                        }
                        
                    }else if(i>=4&&i<=5||i>7){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                else if(i==0&&j==5){
                    System.out.print("  ");
                }
                else
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    }

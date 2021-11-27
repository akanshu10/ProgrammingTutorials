
public class ConcatTest {
    public static String concatTimeString1(){
        String s="akanshu";
        for(int i=0;i<10000;i++){
            s=s+"rajput";
        }
        return s;
    }
    public static String concatTimeStringBuffer1(){
        StringBuilder sb=new StringBuilder("akanshu");
        for(int i=0;i<100000;i++){
            sb.append("rajput");
        }
        return sb.toString();
    }
    public static void main(String[] args){
        long startTime=System.currentTimeMillis();
        concatTimeString1();
        System.out.println("String time "+(System.currentTimeMillis()-startTime)+" ms");
         startTime=System.currentTimeMillis();
        concatTimeStringBuffer1();
        System.out.println("String Buffer time "+(System.currentTimeMillis()-startTime)+" ms");
    }
}

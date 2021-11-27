import java.util.StringTokenizer;

import javax.swing.plaf.synth.SynthStyleFactory;
public class StringToken1 {
    public static void main(String[] args){
        long startTime=System.currentTimeMillis();
        StringTokenizer st=new StringTokenizer("Akanshu Rajput"," ");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        System.out.println("Time "+(System.currentTimeMillis()-startTime));
        startTime=System.currentTimeMillis();
        String s=new String("Akanshu Rajput");
        String[] s1=s.split(" ");
        System.out.println(s1.length);
        for(String s2:s1){
            System.out.println(s2);
        }
        System.out.println("Time "+(System.currentTimeMillis()-startTime));
        String myname=new String("akanshu");
        for(int i=0;i<myname.length();i++){
            System.out.println(myname.charAt(i));

        }

    }
    
}

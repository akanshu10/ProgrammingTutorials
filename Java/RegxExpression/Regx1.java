package RegxExpression;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regx1 {
    public static void main(String[] args){
        Pattern p=Pattern.compile(".a");
        Matcher m = p.matcher("ba");
        boolean b= m.matches();

        boolean p1=Pattern.compile(".a").matcher("ba").matches();
        System.out.println(p1);
        System.out.println(b);

        boolean p2 = Pattern.matches(".a", "ba");
        System.out.println(p2);
        Pattern p3=Pattern.compile("\\b");
        Matcher m1 = p3.matcher("A");
        boolean b3=m1.matches();
        
        System.out.println(b3);
    }
    
}

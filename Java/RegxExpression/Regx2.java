package RegxExpression;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regx2 {
    public static void main(String[] args){
        Pattern p = Pattern.compile("[789]{2}[0-9]{8}");
        Matcher m = p.matcher("7812345678");
        boolean b=m.matches();
        System.out.println(b);

        Pattern P1 = Pattern.compile("[^a-z^A-Z^0-9]");
        Matcher m1 = P1.matcher("7");
        boolean b1 = m1.matches();

        

        System.out.println(b1);
    }
    
}

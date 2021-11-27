import java.util.regex.*;
public class RegxExample1 {
    public static void main(String[] args){
        Pattern p=Pattern.compile("[a-z&&[def]]");
        Matcher m=p.matcher("d");
        boolean b=m.matches();

        boolean b1=Pattern.compile("..a..h.").matcher("akanshu").matches();
        boolean b3=Pattern.matches("..a..h.", "akanshu");
        System.out.println(b3);
        System.out.println(b1);

        System.out.println(b);
    }
    
}

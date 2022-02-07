package RegxExpression;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regx3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter the regex pattern : ");
            Pattern p = Pattern.compile("a");
            //System.out.println(p);
            System.out.println("Enter the text : ");
            Matcher m = p.matcher("akanshu");
            //System.out.println(m);
            boolean found = false;
            while(m.find()){
               
                System.out.println("I found the text : "+m.group()+ " starting at "+m.start()+" and end at the index of "+m.end());
                
                found=true;

            }
            if(!found){
                System.out.println("No matches found");
            }
            break;
        }
    }
    
}

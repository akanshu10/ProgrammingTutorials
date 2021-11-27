import java.lang.reflect.Array;
import java.util.Arrays;

public class TestSubstring {
    public static void main(String[] args) {
        String s=new String("Hello! This is my number.");
        String[] sentence=s.split("\\!");
        System.out.println(Arrays.toString(sentence));
        System.out.println(sentence.length);
    }
    
}

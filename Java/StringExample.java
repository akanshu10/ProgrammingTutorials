import java.util.ArrayList;
import java.util.*;
public class StringExample{
    ArrayList<Character>al;
    StringExample(){
        al=new ArrayList<Character>();
        al.add('A');al.add('a');
        al.add('E');al.add('e');
        al.add('I');al.add('i');
        al.add('O');al.add('o');
        al.add('U');al.add('u');
    }
    private boolean isVowel(char c){
        for(int i=0;i<al.size();i++){
            if(c==al.get(i)){
                return true;
            }
        }
            return false;
        }
    
    public int countVowels(String s){
        int countVowel=0;
        int size=s.length();
        for(int i=0;i<size;i++){
            char c=s.charAt(i);
            if(isVowel(c)){
                countVowel=countVowel+1;
            }
        }
        return countVowel;
    }

    public static void main(String[] args){
        StringExample example=new StringExample();
        String str="akanshu";
        int noOfVowel=example.countVowels(str);
        System.out.println("String : "+str);
        System.out.println("No of vowels :"+noOfVowel);
    }
}
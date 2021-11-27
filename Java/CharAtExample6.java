import java.util.*;
public class CharAtExample6 {
    ArrayList<Character>al;
    CharAtExample6(){
        al=new ArrayList<Character>();
        al.add('A');al.add('a');al.add('E');al.add('e');
        al.add('I');al.add('i');al.add('O');al.add('o');
        al.add('U');al.add('u');
    }
    private boolean isVowel(char c){
          for(int i=0;i<al.size();i++){
              if(c==al.get(i))
              return true;
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
        CharAtExample6 c=new CharAtExample6();
        String s="akanshu is my name";
        int noOfVowels=c.countVowels(s);
        System.out.println(s);
        System.out.println(noOfVowels);
    }
}

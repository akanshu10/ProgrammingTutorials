class CharAt{
    public char charAt1(int index,String value){
        if(index<0|| index>=value.length()){
        throw new StringIndexOutOfBoundsException(index);
        }
        char[] ch=value.toCharArray();
        for (int i=0;i<value.length();i++){
            if(i==index){
                return ch[i];
            }
        }
        return 0;
    }
}
public class CharAtExample extends CharAt {
    public static void main(String[] args) {
        CharAt c=new CharAt();
        String s=new String("akanshu");
        System.out.println(c.charAt1(4, s));
        System.out.println(c.charAt1(0, s));
        System.out.println(c.charAt1(s.length()-1, s));
    }
}

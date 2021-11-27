public class ReverseOfString {
    public static void main(String[] args) {
        String s=new String("akanshu");
        int size=s.length();
        for(int i=size-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
    
}

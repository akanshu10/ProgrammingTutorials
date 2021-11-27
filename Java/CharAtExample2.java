public class CharAtExample2 {
    public static void main(String[] args) {
        String s=new String("akanshu");
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);
    }
    
}

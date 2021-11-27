public class StringOperatuin6 {
    public static void main(String[] args){
        String s="akanshu";
        s.replace("akanshu", "rajput");
        System.out.println(s);
        double a=10.5;
        String s1=String.valueOf(a);
        System.out.println(s1+10);
        String s2=s.intern();
        System.out.println(s2);
    }
    
}

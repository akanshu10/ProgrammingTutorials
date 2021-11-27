public class StringBufferExample1 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("akanshu");
        System.out.println(sb.capacity());
        sb.append("rajput");
        System.out.println(sb.capacity());
        sb.insert(2, "kumar", 2, 4);
        System.out.println(sb.capacity());
        sb.reverse();
        sb.replace(2, 4, "abcfdfdfdffdf");
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
    
}

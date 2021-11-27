public class WrapperClassExample {
    public static void main(String[] args){
        int a=20;
        Integer i=Integer.valueOf(a);
        Integer j=i;
        System.out.println(a+" "+i+" "+j);
        System.out.println(i.getClass()+" "+j.getClass());
    }
    
}

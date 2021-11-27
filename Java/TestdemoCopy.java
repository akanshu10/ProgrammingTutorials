public class TestdemoCopy {
    public static void main(String[] args){
        char[] copyfrom ={'a','b','c','d','e','f','g'};
        char[] copyTo=new char[7];
        System.arraycopy(copyfrom, 2, copyTo, 0, 5);
        System.out.println(String.valueOf(copyTo));
    }
    
}

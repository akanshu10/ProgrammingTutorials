import javax.sql.rowset.spi.SyncResolver;

public class TestStringComparision {
    String s1="akanshu";
    String s2=new String("Akanshu");
    String s3="Rajput";
    String s4="AKANSHU";
    public static void main(String[] args){
        TestStringComparision t=new TestStringComparision();
        System.out.println(t.s1.equals(t.s2));
        System.out.println(t.s1.equals(t.s3));
        System.out.println(t.s1.equals(t.s4));
        System.out.println(t.s1.equalsIgnoreCase(t.s2));
        System.out.println(t.s1.equalsIgnoreCase(t.s3));
        System.out.println(t.s1.equalsIgnoreCase(t.s4));
        System.out.println(t.s1.compareTo(t.s2));
        System.out.println(t.s1.compareTo(t.s3));
        System.out.println(t.s1.compareTo(t.s4));
    }
}

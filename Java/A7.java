interface Printable1{
    void print();
    default void msg(){System.out.println("default method");}  
}
interface showable{
    void print();
    default void ms1g(){System.out.println("default method");}  
}
public class A7 implements Printable1,showable{
    public void print(){
        System.out.println("print");
    }
    
    public static void main(String[] args){
        Printable1 p=new A7();
        p.print();
        p.msg();
        showable s=new A7();
        s.print();
        s.ms1g();

    }
    
}

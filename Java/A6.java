interface Printable{
    void print();
}
public class A6 implements Printable {
    public void print(){
        System.out.println("Inside Printable to A6");
    }
    public static void main(String[] args){
        Printable p=new A6();
        p.print();
    }
    
}

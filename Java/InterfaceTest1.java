interface I{
    void a();
    void b();
    void c();
    void d();
}
abstract class M implements I{
    public void c(){
        System.out.println("I am c");
    }
}
class N extends M{
    public void a(){
        System.out.println("I am A");
    }
    public void b(){
        System.out.println("I am B");
    }
    public void d(){
        System.out.println("I am D");
    }

}
public class InterfaceTest1 {
    public static void main(String[] args){
        I i=new N();
        i.a();
        i.b();
        i.c();i.d();
    }
}

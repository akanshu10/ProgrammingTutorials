class A1{
    A1 get(){
        return this;
    }
    void print(){
        System.out.println("A1");
    }
}
class A2 extends A1{
    A1 get(){
        return this;
    }
    void print(){
        System.out.println("A2");
    }
}
class A3 extends A2{
    A1 get(){
        return this;
    }
    void print(){
        System.out.println("A3");
    }
}
public class CoverientExample {
    public static void main(String[] args){
        A1 a=new A1();
        a.get().print();
        A2 a2=new A2();
        a2.get().print();
        A3 a3=new A3();
        a3.get().print();

    }
}

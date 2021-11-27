class Human{
    String name;
    String Color;
    Human(){
    }
}
class Child extends Human{

}
class Parent1 extends Child{
    public static void main(String[] args){
        Parent1 p=new Parent1();
        Child c=new Child();
        c.name="rajput";
        p.name="akanshu";
        p.Color="red";
        System.out.println(c.name);
        System.out.println(p.name+p.Color);
    }
}
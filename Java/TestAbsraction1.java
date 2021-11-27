abstract class Shape{
    abstract void draw();
}
class Circle1 extends Shape{
    void draw(){
        System.out.println("Circle");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Rectangle");
    }
}
public class TestAbsraction1 {
    public static void main(String[] args){
        Shape s1=new Circle1();
        s1.draw();
        Shape s2=new Rectangle();
        s2.draw();
    }
}

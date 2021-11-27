class Adder{
    static int  add(int a,int b){
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }
}
public class TestOverloading1 {
    public static void main(String[] args){
        Adder a=new Adder();
        System.out.println(a.add(2, 3));
        System.out.println(a.add(2.4, 3.4));
        System.out.println(Adder.add(2, 2));
    }
}

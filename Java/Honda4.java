abstract class Bike{
    abstract void run();
}
public class Honda4 extends Bike{
    void run(){
        System.out.println("Bike for me");
    }
    public static void main(String[] args){
        Bike b=new Honda4();
        b.run();
    }
    
}

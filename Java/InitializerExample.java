import javax.sql.rowset.spi.SyncResolver;

public class InitializerExample {
    int speed;
    InitializerExample(){
        System.out.println("Inside construtor");
    }
    {
        System.out.println("inside InitializerExample");
    }
    InitializerExample(int a){
        this.speed=a;
        System.out.println(this.speed);
    }

    public static void main(String[] args){
        InitializerExample i=new InitializerExample();
        InitializerExample i1=new InitializerExample(10);

    }
    
}

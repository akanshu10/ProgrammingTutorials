class Testjava{
    private int i;
    Testjava(){}
    Testjava(int i){
        this.i=i;
    }
    public int getValue(){
        return i;
    }
    public void setValue(int i){
        this.i=i;    
    }
    @Override
    public String toString(){
        return Integer.toString(i);
    }
    
}
public class Javapoint {
    public static void main(String [] args){
        Testjava t=new Testjava(10);
        System.out.println(t);
    }

}

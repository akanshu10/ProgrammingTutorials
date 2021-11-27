public class RecusionExample {
    static int count=0;
    static void recursion(){
        count++;
        if(count<=5){
            System.out.println("Hello "+count);
            recursion();
        }
    }
    public static void main(String[] args){
        recursion();
    }
    
}

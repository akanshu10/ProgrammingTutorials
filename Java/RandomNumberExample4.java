import java.util.concurrent.ThreadLocalRandom;
public class RandomNumberExample4 {
    public static void main(String[] args){
        int a=ThreadLocalRandom.current().nextInt();
        int b=ThreadLocalRandom.current().nextInt();
        System.out.println("Randomly genrated Integer Value :");
        System.out.println(a);
        System.out.println(b);
        
    }
    
}

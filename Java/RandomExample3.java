import java.util.Random;
public class RandomExample3 {
    public static void main(String[] args){
        Random random=new Random();
        int x=random.nextInt(50);
        int y=random.nextInt(1000);

        System.out.println("Random Gentared Integer value :");
        System.out.println(x);
        System.out.println(y);

        float a=random.nextFloat();
        float b=random.nextFloat();
        System.out.println("Random Genrated Float value :");
        System.out.println(a);
        System.out.println(b);

        double d=random.nextDouble();
        double e=random.nextDouble();
        System.out.println("Random Gernrated Double Value :");
        System.out.println(d);
        System.out.println(e);

        
    }
    
}

class Bank{
    float getRateOfInterest(){
        return 0;
    }
}
class Sbi extends Bank{
    float getRateOfInterest(){
        return 7.4f;
    }
}
class Icic extends Bank{
    float getRateOfInterest(){
        return 5.342f;
    }
}
class Hdfc extends Bank{
    float getRateOfInterest(){
        return 6.4f;
    }
}
public class TestPolymorphism {
    public static void main(String[] agrs){
        Bank b;
        b=new Sbi();
        System.out.println("Interst for sbi"+b.getRateOfInterest());
        b=new Icic();
        System.out.println("ICICI"+b.getRateOfInterest());
        b=new Hdfc();
        System.out.println("HDFC"+b.getRateOfInterest());
    }
}

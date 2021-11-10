import java.util.*;

class area_parameter{
    public static void main(String[] args){
        double radius,area,parameter;
        final double PI=3.14;
        System.out.println("Enter the radius of the Circle :");
        Scanner sc=new Scanner(System.in);
        radius=sc.nextDouble();
        area=PI*radius*radius;
        parameter=2*PI*radius;
        System.out.println("Area of Circle :"+area);
        System.out.println("Parameter of Circle :"+parameter);
    }
}
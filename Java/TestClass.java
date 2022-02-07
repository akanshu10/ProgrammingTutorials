class TestClass{
    TestClass(byte a ,int b){
        System.out.println("hello a "+a+"b "+b);
    }
    TestClass(double a ,double b){
        System.out.println("Bye a "+a+"b "+b);
    }
    public static void main(String[] args) {
        byte a=10;
        byte b=15;
        TestClass t =new TestClass(a, b);


    }
}
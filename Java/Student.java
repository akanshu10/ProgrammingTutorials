public class Student {
    int rollNo;
    String name;
    String Address;
    Student(int rollNo,String name,String Address){
        this.rollNo=rollNo;
        this.name=name;
        this.Address=Address;
    }
    public String toString(){
        return (rollNo+" "+name+" "+Address);
    }
    public static void main(String[] args) {
        Student s1=new Student(101, "Akankshu", "Bijnor");
        System.out.println(s1.toString());
    }
}

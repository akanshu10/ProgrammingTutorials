class Address{
    String city,state,country;
    int pincode;
    public Address(String city,String state,String country,int pincode){
        this.city=city;
        this.state=state;
        this.country=country;
        this.pincode=pincode;
    }
}
public class Employee {
    int id;
    String name;
    Address address;
    public Employee(int id,String name,Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    void display(){
        System.out.println(id+ " "+name);
        System.out.println(address.city+" "+address.state+" "+address.country+" "+address.pincode);
    }
    public static void main(String [] args){
        Address address1=new Address("Bijnor", "U.P.", "India", 246732);
        Employee e=new Employee(1, "Akankshu", address1);
        e.display();
    }
    
}

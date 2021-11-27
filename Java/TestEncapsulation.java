import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

class Account{
    private long acc_no;
    private String name;
    private String email;

    public long getAcc(){
        return acc_no;
    }
    public void  setAcc(long acc_no){
        this.acc_no=acc_no;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
}
public class TestEncapsulation extends Account {
    public static void main(String[] args){
        Account a=new TestEncapsulation();
        a.setAcc(12345);
        a.setEmail("akanshurajput655@gmail.com");
        a.setName("Akanshu kumar");
        System.out.println(a.getName());
        System.out.println(a.getEmail());
        System.out.println(a.getAcc());
        System.out.println();
    }
}

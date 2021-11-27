import java.lang.Cloneable;

import javax.swing.plaf.synth.SynthScrollBarUI;
public class CloneObjectExample implements Cloneable {
    int rollno;
    String name;
    CloneObjectExample(int rollno,String name){
        this.name=name;
        this.rollno=rollno;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args){
        try{
        CloneObjectExample c1=new CloneObjectExample(187351006, "Akanshu");
        CloneObjectExample c2=(CloneObjectExample)c1.clone();

        System.out.println(c1.rollno+" "+c1.name);
        System.out.println(c2.rollno+" "+c2.name);
    }catch(CloneNotSupportedException c){
        
    }
}

    
}

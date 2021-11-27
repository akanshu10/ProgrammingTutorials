import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.FileOutputStream;
public class FIleOutputStreamExample2 {
   public static void main(String args[]) {
       try{
       FileOutputStream fout1 = new FileOutputStream("D:\\txt.txt");
       String s="My name is akanshu Rajput. I am pursuing B. Tech from Rajkiya Engineering College Bijnor. I have Completed my Scholling from Nutan Inter College Tisotra";
       byte[] b=s.getBytes();
       fout1.write(b);
       fout1.close();
       System.out.println("Sucess...");
    }catch(Exception e){
        System.out.println(e);
    }
       
   }

}

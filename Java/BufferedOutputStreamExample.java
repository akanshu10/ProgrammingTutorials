import java.io.*;
public class BufferedOutputStreamExample {
    public static void main(String[] args){
        try{
        FileOutputStream fout=new FileOutputStream("D:\\txt.txt");
        BufferedOutputStream bfout = new BufferedOutputStream(fout);
        String s="akanshu rajput";
        byte b[]=s.getBytes();
        bfout.write(b);
        bfout.flush();
        bfout.close();
        fout.close();
        System.out.println("Success...");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

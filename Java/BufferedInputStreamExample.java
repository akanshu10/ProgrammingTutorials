import java.io.*;
public class BufferedInputStreamExample {
    public static void main(String[] args){
        try{
        FileInputStream fin = new FileInputStream("D:\\txt.txt");
        BufferedInputStream br=new BufferedInputStream(fin);
        int i=0;
        while((i=br.read())!=-1){
            System.out.print((char)i);
        }
        br.close();
        fin.close();


    }catch(Exception e){
        System.out.println(e);
    }
    }
}

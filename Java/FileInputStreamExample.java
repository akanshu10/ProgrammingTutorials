import java.io.FileInputStream;
import java.util.concurrent.ExecutionException;
public class FileInputStreamExample {
    public static void main(String[] args){
        try{
            FileInputStream fin = new FileInputStream("D:\\txt.txt");
            int j=0;
            int count=1;
            while((j=fin.read())!=-1){
                System.out.print((char)j);
                if(j==32){
                    count++;
                }
            }
            System.out.println(count);
            fin.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}

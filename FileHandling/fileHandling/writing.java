import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writing {
    public static void main(String[] args) {
        File f=new File("D:\\Advanced JAVA\\FileHandling\\user.txt");
        try{
        FileWriter fw=new FileWriter(f,true);
        fw.write("\n"+"JaiShreeram12345@gmail.com");
        fw.write("\n");
        fw.write("JaiHind#&1234");
        fw.close();
    }catch(IOException e){
        System.out.println(e);
    }
}
}

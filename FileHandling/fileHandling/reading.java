import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class reading {
    public static void main(String[] args) {
        try{
        FileReader f=new FileReader("D:\\FeedbackForm.docx");
        int i=f.read();
        while(i!=-1){
            System.out.print((char)i);
            i=f.read();
        }
    }catch(IOException e){
        System.out.println(e);
    }
}
}

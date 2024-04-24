import java.io.File;

public class countFile {
    public static void main(String[] args) {
        File f=new File("D:\\shibu Vlog video\\sumala_photos");
        int count=0;
        String str[]=f.list();
        for(String name: str){
            count++;
            System.out.println("File "+count +" "+name);
        }
        System.out.println("Number of Files are: "+count);
    }
}

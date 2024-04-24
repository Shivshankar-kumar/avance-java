import java.io.*;
public class fileCreation{
    public static void main(String[] args) {
        //object of File
        File f1=new File("fileHandling/user.txt");
        //if user.java will present in working directry then it will return true otherwise false
        System.out.println(f1.exists());

        //if user.java doesn't exist in directry then createNewFile() method will create new file
        try{
        if(f1.createNewFile()){
            System.out.println("File has been created");
        }else{
            System.out.println("File already exist.");
        }
        }
        catch(IOException e){
            System.out.println(e);
        }

        //create Directry
        File dir=new File("fileHandling/Directry");
        System.out.println(dir.isDirectory());//false/true

        try{
            if(dir.mkdir()){
                System.out.println("directry has been created");
            }else{
                System.out.println("directry already exists in working directry");
        }
    }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
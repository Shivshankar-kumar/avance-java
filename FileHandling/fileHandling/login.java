import java.util.Scanner;
import java.lang.String;
public class login {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
        System.out.println("1 Login\n2 Exit\n");
        int val=sc.nextInt();
        if(val==1){
            System.out.print("User Name: ");
            String name=sc.nextLine();
            System.out.print("Password:");
            int pas=sc.nextInt();
            if(name=="Shivshankarkumar" && pas==123){
            System.out.println("Login Success!");
            }else{
            System.out.println("Invalid User");
            }
        }else{
            exit();
        }
}

    private static void exit() {
    }
}

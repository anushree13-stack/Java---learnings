import java.io.File;

public class FileName4 {
    public static void main(String[] args) {
        File newfile = new File("Anushree5.txt");
        File newfile2=new File("Anushree5.txt");
        if(newfile.equals(newfile2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    
}

import java.io.File;
import java.io.IOException;

public class FileName3 {
    public static void main(String[] args) {
        try{
            File filename=new File("Anushree2.txt");
            if(filename.delete()){
                System.out.println("deleted");
            }
        }
        catch(IOException e){
            System.out.println("doesnt exist");
        }
    }
}

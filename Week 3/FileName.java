import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class FileName{
    public static void main(String[] args) {
        File filename=new File("Anushree.txt");
        try{
         if(filename.createNewFile()){
            System.out.println("File is created");
         }else{
            System.out.println("Not created");
         }
        }
        catch(IOException e){
            System.out.println("File not created");
        }
    }
}
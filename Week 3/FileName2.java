import java.io.File;
import java.io.IOException;

public class FileName2 {
    public static void main(String[] args) {
        File filename=new File("Anushree2.txt");
        try{
            if(filename.createNewFile()){
                System.out.println("true");
            }
            if(filename.delete()){
                System.out.println("true");
            }
        }
         //   System.out.println("length is"filename.getLength());
           catch(IOException e){
           System.out.println("cannot find");
           }
    }
}


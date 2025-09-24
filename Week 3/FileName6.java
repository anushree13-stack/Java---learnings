
import java.io.FileWriter;
import java.io.IOException;
public class FileName6 {
    public static void main(String[] args) {
       // File filename = new File("Pritha.txt");
        try{
      FileWriter writer = new FileWriter("Pritha.txt");
        writer.write("Hello,My name is Priths");
        writer.write("i live in USA");
        writer.close();
    }
    catch(IOException e){
        System.out.println("Not found");
         e.printStackTrace();
    }
    }
}

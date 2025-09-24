import java.io.File;
import java.io.IOException;

public class FileName5 {
    public static void main(String[] args) {
        File newfile2=new File("Anushree7.txt");
        try{
        if(newfile2.createNewFile()){
            System.out.println("true");
        }
        if(newfile2.exists()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    catch(IOException e){
        System.out.println("Not found");
    }
    
}
}

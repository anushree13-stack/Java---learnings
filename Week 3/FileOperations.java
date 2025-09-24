import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileOperations {
    public static void main(String[] args) {
        try{
        File filename=new File("Student.txt");
        File filename2=new File("Student.txt");
        filename.createNewFile();
        FileWriter writer=new FileWriter("Student.txt");
        writer.write("Age:19,Name:Aryan,City:Hyderabad\n");
        writer.write("Age:20,Name:Anu,City:Hyderabad\n");
        writer.close();
        System.out.println("Read the file"+filename.canRead());
        System.out.println("Path of the file"+filename.getAbsolutePath());
        System.out.println("Name of the file"+filename.getName());
        System.out.println("If file can be written"+filename.canWrite());
        if(filename.renameTo(filename2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
            Scanner reader=new Scanner(new File("Student.txt"));
            while(reader.hasNextLine()){
            String line=reader.nextLine();
                System.out.println(line);
    }
     reader.close();
}
   
    catch(IOException e){
        System.out.println("Not found or created");
    }
}
}

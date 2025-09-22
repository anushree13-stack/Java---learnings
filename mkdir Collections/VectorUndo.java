import java.util.Scanner;
import java.util.Vector;

public class VectorUndo {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        Vector<Character> vec = new Vector<>();
        for(char ch:s.toCharArray()){
            vec.add(ch);
        }
        vec.remove(s.length() - 1);
        System.out.println(vec);
        obj.close();



    }
}

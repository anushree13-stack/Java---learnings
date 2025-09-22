import java.util.Scanner;
import java.util.Stack;
public class StackClass {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.next();
        Stack<Character> s =new Stack<>();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        String reversed=" ";
        while(!s.isEmpty()){
            reversed+=s.pop();
        }
        obj.close();

    }
    
}

import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> s =new Stack<>();
        s.push(100);
        s.push(200);
        s.push(400);
        //s.peek();
        //pop(100);
       // System.out.println(s);
    
         System.out.println( s.peek());
         s.remove(Integer.valueOf(400));
          System.out.println(s);
          System.out.println(s.size());
    
    }
    
}

import java.util.Stack;
public class StackExample3 {
      public static  boolean stackmethod(){

         Stack<Integer> s = new Stack<>();
        while(s.isEmpty()) {
            s.push(100);
            s.push(200);
        }
        while(!s.isEmpty()){
            s.remove(Integer.valueOf(200));
        }
        return s.isEmpty();
    }
    public static void main(String[] args) {
     System.out.println(stackmethod());
}
}

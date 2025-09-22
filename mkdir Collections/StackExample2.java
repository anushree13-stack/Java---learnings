import java.util.Stack;
public class StackExample2 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Stack remove:"+s.remove(Integer.valueOf(3)));
        System.out.println(s);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.size());
       }
    }


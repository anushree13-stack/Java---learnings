import java.util.Stack;
public class Paranthesis {
        public static boolean balanced(){
        Stack<Integer> s=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch='(' || ch='['||ch='{'){
                s.push(ch);
            }else(s.isEmpty()){
                char top=s.pop();
                if(ch=')'&& top!='('||ch=']' && top!='[' || ch='{' && top!='}'){
                    return false;
                }
            }
            return isEmpty();
        public static void main(String[] args) {
       System.out.println(balanced());
    }
}
        }
        

}

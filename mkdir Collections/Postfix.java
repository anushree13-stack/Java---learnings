import java.util.Stack;
public class Postfix {
        public static int method(String str){
        Stack<Integer> s = new Stack<>();
        for(char ch:str.toCharArray()){
            if(Character.isDigit(ch)){
                s.push(ch-'0');
            }else{
                int val1=s.pop();
                int val2=s.pop();
                int result=0;
                switch(ch){
                    case'+':
                    result=val1+val2;
                    break;
                    case'-':
                    result=val1-val2;
                    break;
                    case'*':
                    result=val1*val2;
                    break;
                    case'/':
                    result=val1/val2;
                    break;
            }
             s.push(result);

        }
    }
    return s.pop();
}

          public static void main(String[] args) {
         String stry="59+83-*4/";
         System.out.println(method(stry));
    }
}
    

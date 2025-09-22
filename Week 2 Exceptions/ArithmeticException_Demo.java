public class ArithmeticException_Demo {
    public static void main(String[] args) {
        try{
            int a = 100;
            int b = 0;
            int c =a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Not divisible");
        }
    }
}

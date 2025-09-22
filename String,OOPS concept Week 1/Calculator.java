public class Calculator{

        public int add(int a,int b){
            return a+b;
        }
        public int sub(int a,int b){
            return a-b;
        }
        public int mul(int a,int b){
            return a*b;
        }
        public int div(int a,int b){
            return a/b;
        }
        public static void main(String[] args) {
            Calculator calc= new Calculator();
            int a=100;
            int b=200;
            System.out.println("Addition is"+calc.add(a,b));
            System.out.println("Subtraction"+calc.sub(a,b));
            System.out.println("Multiplication"+calc.mul(a,b));
            System.out.println("Division"+calc.div(a,b));
    }
}

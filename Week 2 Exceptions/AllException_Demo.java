public class AllException_Demo {
    public static void main(String[] args) {
        try{
            int a=100;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Not in index");

        }
        try{
            int[] arr={1,2,3,4,5};
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }
        try{
            String s=" ";
            System.out.println(s.length());
        }
        catch(NullPointerException e){
            System.out.println("Null pointer exception");
        }
        try{
             String str="abc";
            int num=Integer.valueOf(str);
            System.out.println(num);
        }
        catch(NumberFormatException e){
            System.out.println("Number Format Exception");
        }
    }
    
}

public class Finally_Demo {
    public static void main(String[] args) {
        try{
            String s ="Hello world";
            System.out.println(s);
        }
        finally{
          System.out.println("Bye World");
        }
    }
}

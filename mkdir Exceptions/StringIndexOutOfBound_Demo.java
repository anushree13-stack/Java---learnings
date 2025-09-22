public class StringIndexOutOfBound_Demo {
    public static void main(String[] args) {
        try{
            String str="Anushreebee";
            System.out.println(str.charAt(12));
        }
        catch(StringIndexOutOfBoundsException e){
          System.out.println("Not in bounds");
        }
    }
}

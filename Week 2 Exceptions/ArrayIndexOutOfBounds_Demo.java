public class ArrayIndexOutOfBounds_Demo {
    public static void main(String[] args) {
        try{
        int[]  arr={1,2,3,4,5};
         System.out.println(arr[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
             System.out.println("out of bounds");
        }
    }
}

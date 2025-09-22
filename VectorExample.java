import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
       
        Vector<Integer> vec =new Vector<>(2);
        vec.add(10);
         System.out.println("The capacity is:"+vec.capacity());
        vec.add(40);
        vec.add(90);
         System.out.println("The capacity is:"+vec.capacity());

        vec.add(100);
        vec.set(2,50);
       System.out.println(vec);
       for(int v:vec){
        System.out.println(v);
       }
       vec.remove(1);
       System.out.println(vec);
       
    }
}

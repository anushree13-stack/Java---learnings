import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;
import java.util.HashMap;
public class VectorExample2 {
    public static void main(String[] args) {
         Scanner obj=new Scanner(System.in);
        Vector<Integer> vec =new Vector<>();
        int N=obj.nextInt();
      //  int target=obj.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=obj.nextInt();
        }
        //Vector<Integer> vec =new Vector<>();
        for(int i=0;i<N;i++){
            vec.add(arr[i]);
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:vec){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
        obj.close();
    }
    
}

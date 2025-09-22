import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;
import java.util.HashMap;
public class MergeVector {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N=obj.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=obj.nextInt();
        }
        Vector<Integer> vec = new Vector<>();
        for(int ar:arr){
            vec.add(ar);
        }
        int M=obj.nextInt();
         int arr1[]=new int[M];
        for(int i=0;i<M;i++){
            arr1[i]=obj.nextInt();
        }
        Vector<Integer> vec1 = new Vector<>();
        for(int ary:arr1){
            vec.add(ary);
        }
        Vector<Integer> mergevec=new Vector<>();
        mergevec.addAll(vec);
        mergevec.addAll(vec1);
        System.out.println(mergevec);
        HashMap<Integer,Integer> map =  new HashMap<>();
        Vector<Integer> vec3= new Vector<>();
        for(int arry:mergevec){
            map.put(arry,map.getOrDefault(arry,0)+1);
            if(map.get(arry)==1){
                vec3.add(arry);
            }
        }
        System.out.println(vec3);
        obj.close();



    }
    
}

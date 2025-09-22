import java.util.Vector;
import java.util.Collections;
import java.util.Scanner;

public class VectorProgram {
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
        int left=0;
        int right=N-1;
        while(left<right){
            int temp=vec.get(left);
            vec.set(left,vec.get(right));
            vec.set(right,temp);
            left++;
            right--;
        }
         int count=0;
         for(int i=0;i<N-1;i++){
            if(vec.get(i).equals(vec.get(i+1))){
                count++;
            }
         }
         if(count>=2){
            System.out.println(vec);
         }
         
        
         System.out.println(vec);
         Collections.sort(vec);
         System.out.println(vec);
       System.out.println(Collections.min(vec));
       System.out.println(Collections.max(vec));

        obj.close();
    }
}

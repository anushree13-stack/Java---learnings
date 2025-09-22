import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class ListNew {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=obj.nextInt();
        }
         List<Integer> dup = new ArrayList<>();
        for(int i=0;i<N;i++){
            dup.add(arr[i]);
        }
        Arrays.sort(arr);
        for(int i=0;i<N-1;i++){
            if(arr[i]==arr[i+1]){
                dup.remove(Integer.valueOf(arr[i]));
            }
        }
        System.out.println("The new list is"+dup);
        obj.close();
    }
    
}

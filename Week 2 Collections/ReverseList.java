import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class ReverseList {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=obj.nextInt();
        }
        List<Integer> listnew2 = new ArrayList<>();
        for(int ar:arr){
            listnew2.add(ar);
        }
        int left=0;
        int right=listnew2.size() - 1;
        while(left<right){
            int temp=listnew2.get(left);
            listnew2.set(left,listnew2.get(right));
            listnew2.set(right,temp);
            right--;
            left++;
        }
        System.out.println(listnew2);
        obj.close();

    }
    
}

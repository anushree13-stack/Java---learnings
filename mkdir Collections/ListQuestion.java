import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class ListQuestion {
    public static void main(String[] args) {
            Scanner obj=new Scanner(System.in);
            int N=obj.nextInt();
            int arr[]=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=obj.nextInt();
            }
            List<Integer> number=new ArrayList<>();
            for(int i=0;i<N;i++){
                number.add(arr[i]);
            }
            System.out.println("Elements of list"+number);
            System.out.println(Collections.max(number));
            System.out.println(Collections.min(number));
            for(int val:arr){
                if(val % 2==0){
                    number.remove(Integer.valueOf(val));
                }

            }
           System.out.println(number);
         Collections.reverse(number);
           System.out.println(number);



    }
}

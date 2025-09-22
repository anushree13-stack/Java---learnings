import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class SetExample {
    Scanner obj=new Scanner(System.in);
    HashSet<Integer> newset = new HashSet<>();
    int N=obj.nextInt();
    int arr[]=new int[N];
    for(int i=0;i<N;i++){
        arr[i]=obj.nextInt();
    }
    for(int j=0;j<N;j++){
        newset.add(arr[i]);
    }
    System.out.println(+newset);
    
}



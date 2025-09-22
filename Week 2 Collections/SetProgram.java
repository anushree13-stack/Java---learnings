import java.util.Scanner;
import java.util.Set;
public class SetProgram {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=obj.nextInt();
        }
      Set<Integer> newset = new Set<>();
      for(int i=0;i<N;i++){
        newset.add(arr[i]);
      }
      for(int ar:arr){
        if(newset.contains(1000)){
            System.out.println("True");
        }else{
            System.out.println("Flase");
        }
      }

}
}
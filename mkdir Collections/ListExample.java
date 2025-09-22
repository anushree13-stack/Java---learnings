import java.util.ArrayList;
import java.util.List;
class ListExample{
    public static void main(String[] args) {
    List<Integer> newlist=new ArrayList<>();
    newlist.add(2);
    newlist.add(100);
    newlist.add(500);
   // System.out.println(newlist);
    newlist.set(1,700);
     System.out.println(newlist);

}
}
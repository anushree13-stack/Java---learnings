import java.util.TreeSet;
public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts= new TreeSet<>();
        ts.add(200);
        ts.add(500);
        ts.add(500);
        ts.add(600);
        ts.add(200);
        System.out.println(ts);
    }
}

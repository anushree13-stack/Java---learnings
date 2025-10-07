import java.util.ArrayList;
//import java.util.Arrays;
public class Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(2000);
        list.add(500);
        list.add(600);
        list.forEach((n) -> {System.out.println(n);});
    }
}

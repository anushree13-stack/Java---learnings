public interface InnerExample {
    void print();

}
class Print implements InnerExample{
    public void print(){
        System.out.println("Hello");
    }
}
public class Example {
    public static void main(String[] args) {
        Print newprint=new Print();
        newprint.print();
    }
}

abstract class Shape {
    abstract void calculateArea();
}
class Circle extends Shape{
    void calculateArea(){
        System.out.println("Circle");
    }
}
class Rectangle extends Shape{
    void calculateArea(){
        System.out.println("Rectangle");
    }
}
public class AbstractClass1{
    public static void main(String[] args) {
        Circle newcircle= new Circle();
        Rectangle newrec = new Rectangle();
        newcircle.calculateArea();
        newrec.calculateArea();
    }
}

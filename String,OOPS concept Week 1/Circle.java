public class Circle {
    double radius;
    public  double calculateArea(double radius){
        double area=(3.14*radius*radius);
        return area;
    }
    public static void main(String[] args) {
        Circle small=new Circle();
        System.out.println("Area is"+small.calculateArea(20.00));
         System.out.println("Area is"+small.calculateArea(40.00));

    }
}

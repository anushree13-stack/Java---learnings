<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
public class Student {
    public static void main(String[] args) {
        List<Integer> marks=new ArrayList<>();
        marks.add(20);
        marks.add(500);
        marks.add(1000);
        marks.add(1500);
        marks.remove((2));
        System.out.println(marks);
        System.out.println(marks.contains(1000));


    }
=======
import java.util.Scanner;

class Student {
    int id;
    String name;
    String grade;
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void assignGrade(int marks){
        switch (marks / 10) {
            case 10:
            case 9:
                grade="A";
                break;
            case 8:
           grade="B";
            break;

            case 7:
            case 6:
            grade="C";
            break;
            
            default:
            grade="Fail";
                break;
        }
    }
    public void displayDetails(){
        System.out.println("The ID is:"+id);
        System.out.println("The name is"+name);
        System.out.println("The grade is"+grade);
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int marks=obj.nextInt();
        Student stu=new Student(100, "ANU");
        stu.assignGrade(marks);
          stu.displayDetails();
        obj.close();
        

    }

>>>>>>> c9fdef03569e18b62e4113675996e8a8f2244e80
}

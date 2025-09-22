public class Employee {
    int id;
    String name;
    int salary;
    public Employee(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void displayInfo(){
        System.out.println("ID is:"+id);
        System.out.println("Name is:"+name);
        System.out.println("Salary is:"+salary);
    }
    public static void main(String[] args) {
        Employee emp=new Employee(22233,"Anu",50000);
        emp.displayInfo();
    }
}

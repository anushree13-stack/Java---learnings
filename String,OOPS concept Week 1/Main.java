 class AccessModifier {
    private int marks;
    int rollno;
    public String name;
    protected String college;

    public AccessModifier(int marks,int rollno,String name,String college){
        this.marks=marks;
        this.rollno=rollno;
        this.name=name;
        this.college=college;
        
    }
    public void display(){
        System.out.println("Marks are"+marks);
         System.out.println("Roll number is"+rollno);
        System.out.println("Name is"+name);
        System.out.println("College is"+college);
    }
        public static void main(String[] args) {
       // Main newmain = new Main();
       AccessModifier obj= new AccessModifier(100,2224322,"GRIET","Shruti");
       obj.display();

    }

    }

 

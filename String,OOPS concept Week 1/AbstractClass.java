
abstract class Animal{
    abstract void sound();

    void sleep(){
        System.out.println("Good night");
    }
}
    class Dog extends Animal{
        void sound(){
            System.out.println("Good morning");
        }
    }
    class Cat extends Animal{
        void sound(){
            System.out.println("Bywe");
        }
    }
    public class AbstractClass{
        public static void main(String[] args) {
            Dog newdog = new Dog();
            Cat newcat = new Cat();
            newdog.sound();
            newdog.sleep();
            newcat.sleep();
            newcat.sound();
           
        }
    }

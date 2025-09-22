abstract class BankAccount {
    abstract void withdraw(double amount);

    void deposit(double amount){
        System.out.println("Deposited"+amount);
    }
}
class SavingsAccount extends BankAccount{
    void withdraw(double amount){
        System.out.println("Withdraw from savings"+amount);
    }
    void deposit(double amount){
         System.out.println("Deposited in savings "+amount);
    }
}
class CurrentAccount extends BankAccount{
    void withdraw(double amount){
        System.out.println("Withdraw from current"+amount);
    }
    void deposit(double amount){
         System.out.println("Deposited in current"+amount);
    }
}
public class Abstract2{
    public static void main(String[] args) {
        SavingsAccount save=new SavingsAccount();
        CurrentAccount current=new CurrentAccount();
         save.deposit(1000);
        save.withdraw(1000);
        save.deposit(20000);
          save.withdraw(2000);
         
    }
}


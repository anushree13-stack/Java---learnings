public class Bank {
    String bankName; 

    public Bank(String bankName) {
        this.bankName = bankName;
    }

   
    class Account {
        int accountNumber;
        double balance;

        public Account(int accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void showDetails() {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        }
    }

    public static void main(String[] args) {
        Bank banky = new Bank("Hatrish Bank");  

       
        Bank.Account acc = banky.new Account(12345, 20000);

        acc.showDetails(); 
    }
}

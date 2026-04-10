class BankAccount {

    String name;
    double balance;

    BankAccount() {
        name = "Guest";
        balance = 0.0;
    }
    BankAccount(String n) {
        name = n;
        balance = 1000.0; 
    }
    BankAccount(String n, double b) {
        name = n;
        balance = b;
    }

    void display() {
        System.out.println("Name: " + name + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount("Ravi");
        BankAccount a3 = new BankAccount("Priya", 5000);

        a1.display();
        a2.display();
        a3.display();
    }
}
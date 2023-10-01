package juaracoding;

public class BankAccount {

    private int acc_no;
    private String name;
    private double balance;

    public void setAccount(int a, String n, double amt) {
        acc_no = a;
        name = n;
        balance = amt;
    }

    public double deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println(amt + " deposited");
        } else {
            System.out.println("Deposit amount must be greater than 0");
        }
        return balance;
    }

    public double withdraw(double amt) {
        if (amt > 0) {
            if (balance >= amt) {
                balance -= amt;
                System.out.println(amt + " withdrawn");
            } else {
                System.out.println("Insufficient Balance");
            }
        } else {
            System.out.println("Withdrawal amount must be greater than 0");
        }
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public void display() {
        System.out.println(acc_no + " " + name + " " + balance);
    }
}

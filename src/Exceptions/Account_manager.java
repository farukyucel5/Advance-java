package Exceptions;

public class Account_manager {
   private double balance;
    public void deposit(double amount) {
        balance = getBalance() + amount;
    }

    public void withdraw(double amount) {
        try {
            if(balance>=amount) {
                balance = getBalance() - amount;
            }else {
                throw new Exception("insufficient balance!");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public double getBalance() {
        return balance;
    }
}

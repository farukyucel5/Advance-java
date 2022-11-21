package Exceptions;

public class A_User_class {
    public static void main(String[] args) {
        Account_manager manager=new Account_manager();
        System.out.println("Balance: "+manager.getBalance());
        manager.deposit(100);
        System.out.println("Balance: "+manager.getBalance());
        manager.withdraw(110);
        System.out.println("Balance: "+manager.getBalance());

    }
}

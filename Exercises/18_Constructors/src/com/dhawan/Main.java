package com.dhawan;

public class Main {

    public static void main(String[] args) {

        Account account = new Account("12234", 0, "Bob", "email@bob.com", "1234");

        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
        
        account.withdrawFunds(100);
        account.depositFunds(50);
        account.withdrawFunds(100);

        account.depositFunds(51);
        account.withdrawFunds(101);

        Account timsAccount = new Account("Tim", "Tim@email.com", "12345");
        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getPhone());
    }
}

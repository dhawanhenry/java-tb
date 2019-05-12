package com.dhawan;

public class Main {

    public static void main(String[] args) {

        /*
        BankAccount bank = new BankAccount();

        bank.setAccountNumber("12345");
        bank.setBalance(0.00);
        bank.setCustomerName("Jeffrey Archer");
        bank.setEmail("jeffrey.archer@gmailsite.com");
        bank.setPhoneNumber("031 245 23 12");
        */

        BankAccount bank = new BankAccount("12345", 0.0, "Jeffrey Archer", "jeffrey.archer@gmailsite.com", "031 245 23 12");
        System.out.println(bank.getAccountNumber());
        System.out.println(bank.getBalance());


        bank.withdrawFunds(100.0);

        bank.depositFunds(50.0);
        bank.withdrawFunds(100.0);

        bank.depositFunds(51.0);
        bank.withdrawFunds(100.0);

        BankAccount mattsAccount = new BankAccount("Matt", "matt@mattEmail.com", "122 254 25 32");
        System.out.println(mattsAccount.getAccountNumber() + " name " + mattsAccount.getCustomerName());

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 24000.0);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.0, "tim@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}

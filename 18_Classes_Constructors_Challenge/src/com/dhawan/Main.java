package com.dhawan;

public class Main {

    public static void main(String[] args) {

        VipCustomer vipCustomerOne = new VipCustomer();
        System.out.println(vipCustomerOne.getCustomerName());

        VipCustomer vipCustomerTwo = new VipCustomer("Bob", 2000.0);
        System.out.println(vipCustomerTwo.getCustomerName());

        VipCustomer vipCustomerThree = new VipCustomer("Tim", 70000.0, "tim@vemail.com");
        System.out.println(vipCustomerThree.getCustomerName());
        System.out.println(vipCustomerThree.getCreditLimit());

    }
}

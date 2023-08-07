package com.workintech.mobile;

public class Main {

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("2222222");
        Contact x = new Contact("Mert", "1111112");
        phone.addNewContact(new Contact("Ayse", "3333333"));
        phone.addNewContact(x);
        phone.addNewContact(new Contact("Ali", "3333333"));
        phone.addNewContact(new Contact("Ayse", "3333334"));
        phone.printContact();

        System.out.println("Index - " + phone.findContact(x));
        System.out.println("Index - String: " + phone.findContact(x.getName()));
        System.out.println("Query - "+ phone.queryContact("Mert"));
        System.out.println("Query - "+ phone.queryContact("Ali"));
        phone.printContact();
        phone.removeContact(x);
    }
}

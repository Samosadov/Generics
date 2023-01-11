package ru_synergy.customgenerictypes;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(12, 50);
        System.out.println(account.getId());

        Account account1 = new Account("1", 45);
        System.out.println(account1.getId());

        int a = (Integer) account.getId() + 1;
    }
}

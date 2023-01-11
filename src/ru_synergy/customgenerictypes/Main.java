package ru_synergy.customgenerictypes;

public class Main {
    public static void main(String[] args) {
        Account<Integer> account = new Account(12, 50);
        System.out.println(account.getId());

        Account<String> account1 = new Account("1", 45);
        System.out.println(account1.getId());

        int a = account.getId() + 1;
        System.out.println(a);

        Account<Integer> account2 = new Account(45, 666, "Something");
    }
}

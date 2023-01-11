package ru_synergy.genericmethods;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        String[] strings = {"Kotlin", "Java", "Basic", "Pascal", "Assembler", "Lisp", "C++"};
        Integer[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        printer.print(nums);
        printer.<String>print(strings);
    }
}

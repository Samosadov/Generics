package ru_synergy.genericmethods;

public class Printer {
    public <T> void print(T[] items){
        for(T item : items) System.out.println(item);
    }
}

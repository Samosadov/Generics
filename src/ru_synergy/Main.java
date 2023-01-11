package ru_synergy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*        Object o = new Scanner(System.in);
        Scanner scanner = null;
        if (o instanceof Scanner) scanner = (Scanner) o;
        if (scanner != null) scanner.nextInt();*/
        Object[] objects = {128, "hi, suckers", 2.7}
        for(Object o : objects) {
            if (o instanceof String) {
                String s = (String) o;
                System.out.println(s);
            }
        }
    }
}

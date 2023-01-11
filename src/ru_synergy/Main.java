package ru_synergy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*        Object o = new Scanner(System.in);
        Scanner scanner = null;
        if (o instanceof Scanner) scanner = (Scanner) o;
        if (scanner != null) scanner.nextInt();*/
       /* Object[] objects = {128, "hi, suckers", 2.7}
        for(Object o : objects) {
            if (o instanceof String) {
                String s = (String) o;
                System.out.println(s);
            }*/
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            nums.add(i * 2);
        int sum = 0;
        for (int num : nums) sum += num;
        System.out.println(sum);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(92, "$ 50.00");
        map.put(95, "$ 665.99");

        ArrayList<String> listHello = new ArrayList<>();
        listHello.add("hi");
        listHello.add("hello");

        ArrayList<String> listBye = new ArrayList<>();
        listBye.add("bye");
        listBye.add("hasta la vista");

        ArrayList<ArrayList<String>> list = new ArrayList<>();
        list.add(listHello);
        list.add(listBye);

        for (ArrayList<String> arrList : list) {
            for (String s : arrList) System.out.println(s);
        }


    }
}

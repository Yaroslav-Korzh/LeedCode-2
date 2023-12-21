package org.example;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList();
        LinkedList<Integer> list2 = new LinkedList();
        LinkedList<Integer> result = new LinkedList<>();

        list1.add(2);
        list1.add(4);
        list1.add(3);
        list2.add(5);
        list2.add(6);
        list2.add(4);

        int a;
        int b = 0;
        int c;

        for (int i = 0; i < list1.size(); i++) {
            result.add(list1.get(i) + list2.get(i));
            if (result.get(i) >= 10) {
               a = result.get(i) - 10;
               result.remove(i);
               result.add(i, a);
               b += 1;
               result.add(++i, b);
               c = result.get(i) + list1.get(i) + list2.get(i);
               result.remove(i);
               result.add(i, c);
            }
        }
        System.out.println(result);

    }
}

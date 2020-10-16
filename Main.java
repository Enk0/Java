package com.company;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(11);
        list.add(21);
        list.add(61);
        list.add(71);
        list.add(51);
        list.add(31);
        list.add(41);
        System.out.println(list.toString());
//            System.out.println(list.kol());
//            System.out.println(list.indexAt(2));
//            System.out.println(list.givePozition(list.indexAt(2)));
//            System.out.println(list.givePozition(list.indexAt(3)));
//            list.swap(1,4);
//            System.out.println(list.toString());
        list.sort();
        System.out.println(list.toString());
    }
}
package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 5,6,7,8,9,9,10);

        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 100,6,-9,3);
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);

        for(Integer l: result) {
            System.out.print(l+ " ");
        }

    }
}

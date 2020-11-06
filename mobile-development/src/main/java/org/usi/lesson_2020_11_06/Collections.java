package org.usi.lesson_2020_11_06;

import java.util.ArrayList;
import java.util.List;

public class Collections {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("item 1");
        list.add("item 2");
        list.add("item 3");
        list.add("item 4");

        List<String> list2 = List.of("1", "2");

        for (String item : list) {
            System.out.println(item);
        }
    }

}

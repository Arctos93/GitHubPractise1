package zad5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task812 {

    public static List<Integer> addingToList(List list) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }
        return list;
    }

    public static void findingLongest(List list) {
        int countMAX = 0;
        int count = 1;
            for (int i = 1; i < 10; i++) {
                if (list.get(i).equals(list.get(i -1))) {
                    count++;
                } else {
                    if (count > countMAX) {
                        countMAX = count;
                    }
                    count = 1;
                }
            }
        System.out.println(countMAX);

        System.out.println(list);
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> integerArrayList = new ArrayList();
        /**
         * wywołanie metody dodawania listy z klawiatury
         */
//        addingToList(integerArrayList);
        /**
        Lista która nie działa
         */
        integerArrayList.add(0);
        integerArrayList.add(23);
        integerArrayList.add(2);
        integerArrayList.add(66);
        integerArrayList.add(3);
        integerArrayList.add(0);
        integerArrayList.add(1);
        integerArrayList.add(1);
        integerArrayList.add(1);
        integerArrayList.add(1);
        /**
         Lista która  działa
         */
//        integerArrayList.add(0);
//        integerArrayList.add(0);
//        integerArrayList.add(0);
//        integerArrayList.add(0);
//        integerArrayList.add(3);
//        integerArrayList.add(0);
//        integerArrayList.add(2);
//        integerArrayList.add(1);
//        integerArrayList.add(1);
//        integerArrayList.add(1);
        findingLongest(integerArrayList);

    }
}

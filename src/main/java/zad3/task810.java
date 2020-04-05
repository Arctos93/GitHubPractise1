package zad3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class task810 {
    public static void main(String[] args) {
        System.out.println(getCzasGetWms(zapelnij(new ArrayList())));
        System.out.println(getCzasGetWms(zapelnij(new LinkedList())));
    }

    public static List zapelnij(List lista) {
        for (int i = 0; i < 10000; i++) {
            lista.add(new Object());
        }
        return lista;
    }

    public static long getCzasGetWms(List lista) {
        // tutaj wpisz swój kod

        get10000(lista);

        // tutaj wpisz swój kod

    }

    public static void get10000(List lista) {
        if (lista.isEmpty()) return;
        int x = lista.size() / 2;

        for (int i = 0; i < 10000; i++) {
            lista.get(x);
        }
    }
}


package zad4;

import java.util.HashSet;
import java.util.Set;

/*
20 wyrazów, które zaczynają się na literę „L”
*/

public class task813 {
    public static Set<String> utworzSet() {
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            stringSet.add("Lalala" + i);
        }
        return stringSet;
    }

    public static void main(String[] args) {
        utworzSet();
    }
}

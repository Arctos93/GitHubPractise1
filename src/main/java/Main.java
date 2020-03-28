//Najmniejsza z N liczb
//        1. Używając klawiatury, wprowadź liczbę N.
//        2. Wczytaj N liczb całkowitych i umieść je w liście: metoda getListaLiczbCalkowitych.
//        3. Znajdź minimum pośród elementów listy: metoda getMinimum.
//
//
//        Requirements:
//        1. Program powinien wyświetlać tekst na ekranie.
//        2. Program powinien czytać wartości z klawiatury.
//        3. Klasa Solution musi mieć tylko trzy metody.
//        4. Metoda getListaLiczbCalkowitych() powinna czytać liczbę N z klawiatury i zwracać listę złożoną z N elementów, zapełnioną liczbami czytanymi z klawiatury.
//        5. Metoda getMinimum() powinna zwracać minimum pośród elementów listy.
//        6. Metoda main() powinna wywoływać metodę getListaLiczbCalkowitych().
//        7. Metoda main() powinna wywoływać metodę getMinimum().


import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    }
        public static int getMinimum (List < Integer > array) {

            return array.stream().min(Integer::compareTo).get();
        }

        public static List<Integer> getListaLiczbCalkowitych () throws IOException {
            ArrayList<Integer> list = new ArrayList<>();

            Scanner size = new Scanner(System.in);
            System.out.println("Podaj ilość liczb całkowitych: ");
            Integer s = size.nextInt();

            for(int i = 0; i < s; i++){
                list.add(size.nextInt());
            } return list;

        }
}

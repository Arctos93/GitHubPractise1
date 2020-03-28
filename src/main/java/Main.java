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
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws Exception {
        List<Integer> listaLiczbCalkowitych = getListaLiczbCalkowitych();
        System.out.println(getMinimum(listaLiczbCalkowitych));

        getListaLiczbCalkowitych();
        getMinimum(listaLiczbCalkowitych);

    }


        public static int getMinimum (List < Integer > array) {
            array.stream().min(Integer::compareTo).get();
            return 0;
        }

        public static List<Integer> getListaLiczbCalkowitych () throws IOException {
            ArrayList<Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
            list.stream()
                    .forEach(number -> list.add(number));
            return list;
            
        }
}

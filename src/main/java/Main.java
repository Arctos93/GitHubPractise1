import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {
        List<Integer> listaLiczbCalkowitych = getListaLiczbCalkowitych();
        System.out.println(getMinimum(listaLiczbCalkowitych));

        getMinimum(listaLiczbCalkowitych);

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


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbę całkowitą: ");
//            list.stream()
//                    .forEach(number -> list.add(number));
//            return list;

        }
}

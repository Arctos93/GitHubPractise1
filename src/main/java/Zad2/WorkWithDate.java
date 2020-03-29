/*
Praca z datami
1. Zaimplementuj metodę isDataNieparzysta(String date), która zwraca true, jeśli liczba dni, licząc od początku roku, jest nieparzysta, a w innym wypadku zwraca false
2. String date zostaje przekazany w fomie: FEBRUARY 1 2013
Pamiętaj, aby liczyć od pierwszego dnia od początku roku.

Przykład:
JANUARY 1 2000 = true
JANUARY 2 2020 = false


Requirements:
1. Program powinien wyświetlać tekst na ekranie.
2. Klasa Solution musi mieć dwie metody.
3. Metoda isDataNieparzysta() musi zwracać true, jeśli liczba dni, licząc od początku roku, jest nieparzysta, a w innym wypadku zwraca false.
4. Metoda main() powinna wywoływać metodę isDataNieparzysta().
 */

package Zad2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


public class WorkWithDate {

    public static void main(String[] args) throws ParseException {
        System.out.println(isDataNieparzysta("MAY 2 2013"));
    }

    public static boolean isDataNieparzysta(String date) throws ParseException {

        DateFormat format = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        Date date1 = format.parse(date);

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date1);
        int year = calendar.get(Calendar.YEAR);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        System.out.println(day + " " + month + " " + year);

        int dayOfYear = LocalDate.of(year, month, day).getDayOfYear();

        if(dayOfYear % 2 == 0){
            return true;
        } return false;
    }
}

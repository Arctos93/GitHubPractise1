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
        System.out.println(isDataNieparzysta("JANUARY 2 2013"));


    }

    public static boolean isDataNieparzysta(String date) throws ParseException {
        DateFormat format = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Date date1 = format.parse(date);
//            System.out.println(date1);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date1);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
//        System.out.println("dane ze stringa");
//            System.out.println("rok  " +year);
//            System.out.println("miesias  " + month);
//            System.out.println("dzien  " + day);
//        LocalDate dateStart = LocalDate.of(year, 1, 1);
        int dateFromString = LocalDate.of(year, month, day).getDayOfYear();
//        System.out.println("data początkowa - " +dateStart);
//        System.out.println("data ze stringa - " +dateFromString);
//        long days = ChronoUnit.DAYS.between(dateStart,dateFromString);
        System.out.println("różnica dni = " + dateFromString);

        if (dateFromString%2==0){
            return false;
        } else
        return true;
    }
}

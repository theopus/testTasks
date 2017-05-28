package task4;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Task4Main {
    public static void main(String[] args) throws ParseException {

        GregorianCalendar birthdayCalendar = new GregorianCalendar(2016, Calendar.MAY, 31 );
        Date birthday = birthdayCalendar.getTime();

        GregorianCalendar todayCalendar = new GregorianCalendar();
        Date today = todayCalendar.getTime();

        if (birthday.getTime() > today.getTime()){
            System.out.println("Selected birthday after current day!");
            return;
        }


        long days = (today.getTime() - birthday.getTime()) / 1000 / 3600 / 24;




        int monthDifference = todayCalendar.get(Calendar.MONTH) - birthdayCalendar.get(Calendar.MONTH);

        if(birthdayCalendar.getActualMaximum(Calendar.DAY_OF_MONTH)
                - birthdayCalendar.get(Calendar.DAY_OF_MONTH)
                + todayCalendar.get(Calendar.DAY_OF_MONTH)
                >= todayCalendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        else
            monthDifference--;

        int month = (todayCalendar.get(Calendar.YEAR) - birthdayCalendar.get(Calendar.YEAR)) * 12 + monthDifference;

        System.out.println("Days : " + days);
        System.out.println("Month : " + month);
        System.out.println("Birthday day of week: " + birthdayCalendar.getDisplayName(
                Calendar.DAY_OF_WEEK,
                Calendar.LONG,
                Locale.ENGLISH));







    }
}

package JavaBeginner;
//Created By Lakshman on 2/19/2019

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ParsingDateTime {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("02 15 2019", formatter);
        LocalTime time = LocalTime.parse("11:33");

        System.out.println(date);
        System.out.println(time);

        String text = date.format(formatter);
        System.out.println(text);

        LocalDate parseDate = LocalDate.parse(text, formatter);
        System.out.println(parseDate);

        LocalDate myDate = LocalDate.of(2019, Month.FEBRUARY, 19);
        String dateString = formatter.format(myDate);
        System.out.println(dateString);

        LocalDate anotherDate = LocalDate.parse(dateString, formatter);
        anotherDate.plusMonths(5).plusDays(5); // This line ignore bcoz dates are immutable.
        anotherDate =  anotherDate.plusMonths(5).plusDays(5); // Now mutable
        System.out.println(formatter.format(anotherDate));
    }
}

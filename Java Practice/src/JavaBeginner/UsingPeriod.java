package JavaBeginner;
//Created By Lakshman on 2/18/2019

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class UsingPeriod {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2019, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2019, Month.APRIL, 30);
        Period period = Period.ofMonths(2);

        cleanAnimalCage(start, end, period);

        System.out.println(start.plus(period));
        System.out.println(LocalDateTime.now().plus(period));
    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end, Period period) {
        while (start.isBefore(end)) {
            System.out.println("Need to clean the cage on date : " + start);
            start = start.plus(period); // adding 1 month
        }
    }
}

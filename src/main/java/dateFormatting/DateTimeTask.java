package dateFormatting;

import org.joda.time.DateTime;
import org.joda.time.Days;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import static java.util.Locale.ENGLISH;

public class DateTimeTask {

    private static String givenDate = "2019-01-24";
    private static String stringDate = "19-07-1986";

    public static void main(String[] args) throws ParseException {
        formattingOfDate();
        formattingOfDateStart();
        formattingOfDateEnd();
        convertDateToString();
        compareTwoDates();
        getDayOfWeak();
    }

    private static void formattingOfDate() throws ParseException {
        SimpleDateFormat dtf = new SimpleDateFormat("yyyy-mm-dd");
        Date date = dtf.parse(givenDate);
        SimpleDateFormat dtf1 = new SimpleDateFormat("dd-mm-yyyy");
        String newDate = dtf1.format(date);
        System.out.println(newDate);


        LocalDateTime now = LocalDateTime.now();

        System.out.println(now.with(LocalTime.MIN));
        System.out.println(now.with(LocalTime.MAX));

        System.out.println();

        Date date2 = dtf1.parse("19-07-2019");
        long mills = date2.getTime();
        System.out.println(mills);

        System.out.println();
    }

    private static void formattingOfDateStart() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", ENGLISH);
        long milliseconds = LocalDate.parse(stringDate, dateFormatter).atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli();
        System.out.println(milliseconds);
    }

    private static void formattingOfDateEnd() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", ENGLISH);
        long milliseconds = LocalDate.parse(stringDate, dateFormatter).atStartOfDay(ZoneOffset.UTC).plusDays(1).minusNanos(1).toInstant().toEpochMilli();
        System.out.println(milliseconds);
    }


    private static void convertDateToString() {
        long timestamp = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date1 = new Date(timestamp);
        System.out.println(dateFormat.format(date1));
    }

    private static void compareTwoDates() {
        LocalDate date = LocalDate.of(2019, 7, 19);
        LocalDate today = LocalDate.now();
        Boolean isToday = date.isEqual(today);
        System.out.println(isToday);

        //num of days between the given date and today
        DateTime startDate = new DateTime(givenDate);
        DateTime endDate = new DateTime();
        Days diff = Days.daysBetween(startDate, endDate);
        System.out.println(diff.getDays());
    }


    private static void getDayOfWeak() {
        Calendar cal = Calendar.getInstance();
        cal.set(1086, 7, 19);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOfWeek);
    }
}



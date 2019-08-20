package dateFormatting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateTimeTask {

    private static String givenDate = "2019-01-24";
    private static String stringDate = "19-07-1986";

    public static void main(String[] args) throws ParseException {
        formattingOfDate();
        formattingOfDateStart();
        formattingOfDateEnd();
        convertDateToString();
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
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
        long milliseconds = LocalDate.parse(stringDate, dateFormatter).atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli();
        System.out.println(milliseconds);
    }

    private static void formattingOfDateEnd() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
        long milliseconds = LocalDate.parse(stringDate, dateFormatter).atStartOfDay(ZoneOffset.UTC).plusDays(1).minusNanos(1).toInstant().toEpochMilli();
        System.out.println(milliseconds);
    }

//    private static void dateSex(){
//    Date date = new Date();
//    long milliSeconds = date.getTime();
//    String strLong = Long.toString(milliSeconds);
//    System.out.println(milliSeconds);
//    }


    private static void convertDateToString() {
        long timestamp = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date1 = new Date(timestamp);
        System.out.println(dateFormat.format(date1));
    }
}



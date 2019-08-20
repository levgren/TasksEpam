package dateFormatting;

import org.joda.time.DateTime;
import org.joda.time.Days;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static java.util.Locale.ENGLISH;

public class DateTimeTask {

    private final DateTimeFormatter DATEFORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy", ENGLISH);
    private String givenDate = "2019-01-24";
    private String stringDate = "19-07-1986";
    private String givenPattern = "dd-mm-yyyy";
    private String pattern = "dd-mm-yyyy";
    private int year = 2019;
    private int month = 7;
    private int day = 19;


    public DateTimeTask formattingOfDate() throws ParseException {
        SimpleDateFormat dtf = new SimpleDateFormat(givenPattern);
        Date date = dtf.parse(givenDate);
        SimpleDateFormat dtf1 = new SimpleDateFormat(pattern);
        String newDate = dtf1.format(date);
        System.out.println("converted data in new format: " + newDate);
        return this;
    }

    public DateTimeTask formattingOfDateStart() {
        long milliseconds = LocalDate.parse(stringDate, DATEFORMATTER).atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli();
        System.out.println("date of the START of the day in long format is: " + milliseconds);
        return this;
    }

    public DateTimeTask formattingOfDateEnd() {
        long milliseconds = LocalDate.parse(stringDate, DATEFORMATTER).atStartOfDay(ZoneOffset.UTC).plusDays(1).minusNanos(1).toInstant().toEpochMilli();
        System.out.println("date of the END of the day in long format is: " + milliseconds);
        return this;
    }

    public DateTimeTask convertDateToString() {
        long timestamp = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date1 = new Date(timestamp);
        System.out.println("converted to string current date-time is: " + dateFormat.format(date1));
        return this;
    }

    public DateTimeTask compareTwoDates() {
        LocalDate date = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        Boolean isToday = date.isEqual(today);
        System.out.println("two dates are equal: " + isToday);

        //num of days between the given date and today
        DateTime startDate = new DateTime(givenDate);
        DateTime endDate = new DateTime();
        Days diff = Days.daysBetween(startDate, endDate);
        System.out.println("number of days between two days is: " + diff.getDays());
        return this;
    }

    public int getDayOfWeek() {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("day of week in string format is: " + dayOfWeek);
        return dayOfWeek;
    }

        public DateTimeTask getDayOfWeekName() {
        Calendar sCalendar = Calendar.getInstance();
        String dayLongName = sCalendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
        System.out.println("the number of the day of week is: " + dayLongName);
        return this;
    }
}



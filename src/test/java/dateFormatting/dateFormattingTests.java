package dateFormatting;

import org.junit.Test;

import java.text.ParseException;

public class dateFormattingTests {
    private DateTimeTask dateTimeTask = new DateTimeTask();

    @Test
    public void dateTimeMethods() throws ParseException {
        dateTimeTask.formattingOfDate()
                .formattingOfDateStart()
                .formattingOfDateEnd()
                .convertDateToString()
                .compareTwoDates()
                .getDayOfWeekName()
                .getDayOfWeek();
    }
}

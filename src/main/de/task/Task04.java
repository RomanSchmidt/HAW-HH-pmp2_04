package de.task;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * @author Stanislaw Brug, Roman Schmidt
 * <p>
 * 2019-03-21 02:43 as ref day of full moon
 * create the first day of spring of requested year
 * work with modulo to add or substract the days to the next full moon
 * get the next saturday
 * done!
 */
public class Task04 {
    private static final Month _springMonth = Month.MARCH;
    private static final int _springDay = 21;
    private static final int _springRefYear = 2019;
    private static final int _fullMoonRefHours = 2;
    private static final int _fullMoonRefMinutes = 43;
    private static final double _synMoonMonthInSec = 29.530588853 * 24 * 60 * 60;

    @NotNull
    public static LocalDateTime getEasterDate(int year) {
        LocalDateTime oneDayAfterSpring = Task04._getOneDayAfterSpringOfYear(year);
        LocalDateTime nextFM = Task04._getNextFM(oneDayAfterSpring);
        return Task04._getNextSunday(nextFM);
    }

    @NotNull
    private static LocalDateTime _getNextSunday(@NotNull LocalDateTime dateTime) {
        int daysToFM = DayOfWeek.SUNDAY.getValue() - dateTime.getDayOfWeek().getValue();
        return dateTime.plusDays(daysToFM > 0 ? daysToFM : DayOfWeek.SUNDAY.getValue());
    }

    @NotNull
    private static LocalDateTime _getNextFM(LocalDateTime dateTime) {
        LocalDateTime refSpring = Task04._getRefSpringDay();
        long durInSec = Duration.between(refSpring, dateTime).toSeconds();
        double mod = durInSec % Task04._synMoonMonthInSec;
        double secToFm = dateTime.isBefore(refSpring) ? -mod : Task04._synMoonMonthInSec - mod;
        return dateTime.plusSeconds((long) secToFm);
    }

    @NotNull
    @Contract(pure = true)
    private static LocalDateTime _getOneDayAfterSpringOfYear(int year) {
        return LocalDateTime.of(year, Task04._springMonth, Task04._springDay + 1, 0, 0);
    }

    /**
     * in our case  our full mooon reference is on the same year, day and month of spring start, so reuse of vars
     */
    @NotNull
    @Contract(pure = true)
    private static LocalDateTime _getRefSpringDay() {
        return LocalDateTime.of(Task04._springRefYear, Task04._springMonth, Task04._springDay, Task04._fullMoonRefHours, Task04._fullMoonRefMinutes);
    }
}

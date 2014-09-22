package com.sirazure.showcase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalQueries;

public class AdjustersApp {
    private static Logger logger = LoggerFactory.getLogger(AdjustersApp.class);

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1988, Month.FEBRUARY, 10);
        logger.info(String.valueOf(date.with(TemporalAdjusters.firstDayOfMonth())));
        logger.info(String.valueOf(date.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY))));

        logger.info(String.valueOf(ZonedDateTime.now().query(TemporalQueries.offset())));

    }
}

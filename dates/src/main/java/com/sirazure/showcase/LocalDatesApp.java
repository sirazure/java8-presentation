package com.sirazure.showcase;


import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LocalDatesApp {
    private static Logger logger = LoggerFactory.getLogger(LocalDatesApp.class);

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        logger.info(now.toString());

        String givenDate = "1988-02-10";
        LocalDate fromString = LocalDate.parse(givenDate);
        logger.info(fromString.toString());

        LocalDate one = LocalDate.of(2014, Month.SEPTEMBER, 23);
        LocalDate two = LocalDate.of(2014, 9, 23);

        logger.info("equality :" + one.equals(two));

        System.out.println(one.plus(1, ChronoUnit.CENTURIES));



    }

}

package com.sirazure.showcase;


import java.time.LocalDateTime;
import java.time.Month;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LocalDateTimesApp {
    private static Logger logger = LoggerFactory.getLogger(LocalDateTimesApp.class);

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        logger.info(now.toString());

        String givenDate = "1988-02-10T02:03:02";
        LocalDateTime fromString = LocalDateTime.parse(givenDate);
        logger.info(fromString.toString());

        LocalDateTime one = LocalDateTime.of(2014, Month.SEPTEMBER, 23, 10, 10, 10);
        LocalDateTime two = LocalDateTime.of(2014, 9, 23, 10, 10, 10);

        logger.info("equality :" + one.equals(two));

        LocalDateTime three = LocalDateTime.of(2014, 9, 23, 10, 11, 12, 234000000);
        logger.info(three.toString());


    }

}

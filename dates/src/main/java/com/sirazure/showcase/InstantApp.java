package com.sirazure.showcase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.*;
import java.util.Date;


public class InstantApp {
    private static Logger logger = LoggerFactory.getLogger(InstantApp.class);

    public static void main(String[] args) {
        Instant now = Instant.now();
        logger.info(now.toString());


        //equivalent of java.util.Date
        Date oldForm = new Date();
        Instant newForm = oldForm.toInstant();
        ZonedDateTime todayAndNow = newForm.atZone(ZoneId.of("Europe/Warsaw"));
        LocalDate today = todayAndNow.toLocalDate();
        LocalTime currently = todayAndNow.toLocalTime();
        LocalDateTime atTheveryMoment = todayAndNow.toLocalDateTime();


    }
}

package com.sirazure.showcase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalTime;

public class LocalTimeApp {
    private static Logger logger = LoggerFactory.getLogger(LocalTimeApp.class);

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        logger.info(now.toString());

        String time = "06:06:06";
        LocalTime fromString = LocalTime.parse(time);
        logger.info(fromString.toString());

        LocalTime built = LocalTime.of(10, 10, 10);
        logger.info(built.toString());


    }
}

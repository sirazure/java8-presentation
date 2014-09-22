package com.sirazure.showcase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonesApp {
    private static Logger logger = LoggerFactory.getLogger(ZonesApp.class);

    public static void main(String[] args) {

        ZoneId warsaw = ZoneId.of("Europe/Warsaw");
        logger.info(warsaw.toString());

        ZoneId gmtPlus3 = ZoneId.ofOffset("GMT", ZoneOffset.ofHours(3));
        logger.info(gmtPlus3.toString());

        ZoneId fromNow = ZoneId.from(ZonedDateTime.now());
        logger.info(fromNow.toString());

        logger.info(ZoneId.systemDefault().toString());

        ZoneId.getAvailableZoneIds().stream()
                .filter(x-> x.contains("Lon"))
                .forEach(logger::info);

        logger.info(ZoneOffset.ofHours(2).toString());
        logger.info(ZoneOffset.ofHours(-2).toString());
        logger.info(ZoneOffset.ofHoursMinutes(10, 45).toString());


    }
}

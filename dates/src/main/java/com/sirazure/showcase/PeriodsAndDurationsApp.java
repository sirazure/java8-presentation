package com.sirazure.showcase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class PeriodsAndDurationsApp {
    private static Logger logger = LoggerFactory.getLogger(PeriodsAndDurationsApp.class);

    public static void main(String[] args) throws InterruptedException {
        Period weekOfTime = Period.ofDays(7);
        logger.info(weekOfTime.toString());

        logger.info(LocalDateTime.now().plus(weekOfTime).toString());

        LocalDate birth = LocalDate.of(1988, 10, 2);
        Period myLife = Period.between(birth, LocalDate.now());
        logger.info(myLife.toString());

        logger.info(ChronoUnit.DAYS.between(birth, LocalDate.now()) + " days from birth");

        Instant now = Instant.now();
        final AtomicInteger sum = new AtomicInteger();
        IntStream.range(0, 100).forEach(sum::getAndAdd);
        Duration execution = Duration.between(now , Instant.now());
        logger.info(execution.getNano()+" nanoseconds of iteration");
    }
}

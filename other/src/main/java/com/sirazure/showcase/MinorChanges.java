package com.sirazure.showcase;

import java.time.DayOfWeek;
import java.util.Base64;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Daily(value = DayOfWeek.MONDAY)
@Daily(value = DayOfWeek.THURSDAY)
@Daily(value = DayOfWeek.WEDNESDAY)
public class MinorChanges {
    private static Logger logger = LoggerFactory.getLogger(MinorChanges.class);
    public static void main(String[] args) {
        String encoded = Base64.getEncoder().encodeToString("Piotr".getBytes());
        logger.info(encoded);
        String decoded = new String(Base64.getDecoder().decode(encoded));
        logger.info(decoded);

        @NonNull Object ref = null;
    }




}

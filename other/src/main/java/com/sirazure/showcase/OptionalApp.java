package com.sirazure.showcase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;


public class OptionalApp {
    private static Logger logger = LoggerFactory.getLogger(OptionalApp.class);

    public static void main(String[] args) {


        dizzyMethod().ifPresent(val -> logger.info(val.toString()));

        Integer old = oldMethod();
        if (old != null && old > 1) {
            logger.info(String.valueOf(old + 1));
        }

        dizzyMethod()
                .filter(x -> x > 1)
                .ifPresent(x -> logger.info(String.valueOf(x + 1)));

        logger.info(String.valueOf(dizzyMethod().get()));

    }


    public static Optional<Integer> dizzyMethod() {
        return Optional.of(2);
    }

    public static Integer oldMethod() {
        return 2;
    }
}

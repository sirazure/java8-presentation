package com.sirazure.showcase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatterApp {
    private static Logger logger = LoggerFactory.getLogger(FormatterApp.class);

    public static void main(String[] args) {
        DateTimeFormatter datePatern = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate localDate = LocalDate.parse("10/02/1988", datePatern);
        logger.info(localDate.toString());

        logger.info(LocalDate.now().format(datePatern));
    }
}

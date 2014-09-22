package com.sirazure.showcase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SwitchApp {
    private static Logger logger = LoggerFactory.getLogger(SwitchApp.class);

    public static void main(String[] args) {
        String name = "Pawel";

        switch (name) {
            case "Piotr":
            case "Lukasz":
            case "Szymon":
                logger.info("developer");
                break;
            case "Pawel":
                logger.info("superman");
                break;
            case "Maciek" :
                logger.info("architect");
                break;
            case "Janek":
                logger.info("QA");
                break;
        }
    }
}

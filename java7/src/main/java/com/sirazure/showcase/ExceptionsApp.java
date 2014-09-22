package com.sirazure.showcase;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class ExceptionsApp {
    private static Logger logger = LoggerFactory.getLogger(ExceptionsApp.class);

    public static void main(String[] args) {
        try {
            new ExceptionsApp().walkIntoMinefield(new Random().nextInt(2));
        } catch (MineExplodedException | StepOnMineException e) {
            logger.error("we are screwed", e);
        }
    }

    public void walkIntoMinefield(int i) throws MineExplodedException, StepOnMineException {
        if (i % 2 == 0) {
            throw new MineExplodedException("kabum");
        } else {
            throw new StepOnMineException("cyk");
        }
    }

    class MineExplodedException extends Exception {
        MineExplodedException(String message) {
            super(message);
        }
    }
    class StepOnMineException extends Exception {
        StepOnMineException(String message) {
            super(message);
        }
    }


}

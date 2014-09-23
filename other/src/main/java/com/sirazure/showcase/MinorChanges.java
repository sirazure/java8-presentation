package com.sirazure.showcase;

import java.util.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinorChanges {
    private static Logger logger = LoggerFactory.getLogger(MinorChanges.class);
    public static void main(String[] args) {
        String encoded = Base64.getEncoder().encodeToString("Piotr".getBytes());
        logger.info(encoded);
        String decoded = new String(Base64.getDecoder().decode(encoded));
        logger.info(decoded);
    }
}

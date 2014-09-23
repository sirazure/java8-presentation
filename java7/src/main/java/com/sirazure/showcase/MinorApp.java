package com.sirazure.showcase;

import java.nio.file.attribute.BasicFileAttributeView;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinorApp {

    private static Logger log = LoggerFactory.getLogger(MinorApp.class);

    public static void main(String[] args) {
        long number = 123_234_234;

        double d = 12.344_566;
        log.info("number: " + number);

        int ten = 0b1010;
        log.info("ten: " + ten);

        Map<Set<String>, Map<StringTokenizer, BasicFileAttributeView>> map = new HashMap<>();
    }
}

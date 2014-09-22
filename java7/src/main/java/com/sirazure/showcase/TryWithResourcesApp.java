package com.sirazure.showcase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Closeable;
import java.io.IOException;

public class TryWithResourcesApp {

    public static void main(String[] args) throws IOException {
        try (Box b = new Box()) {
            b.open();
        }
    }

    static class Box implements Closeable {

        Logger log = LoggerFactory.getLogger(Box.class);

        public void open() {
            log.info("opening");
        }

        @Override
        public void close() throws IOException {
            log.info("closing");
        }
    }
}

package com.sirazure.showcase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;


public class OptionalApp {
    private static Logger logger = LoggerFactory.getLogger(OptionalApp.class);

    public static void main(String[] args) {


        dizzyMethod().ifPresent(System.out::println);

        Integer old = oldMethod();
        if (old != null && old > 1) {
            System.out.print(old + 1);
        }

        dizzyMethod()
                .filter(x -> x > 1)
                .ifPresent(x -> System.out.print(x + 1));

    }


    public static Optional<Integer> dizzyMethod() {
        return Optional.of(2);
    }

    public static Integer oldMethod() {
        return 2;
    }
}

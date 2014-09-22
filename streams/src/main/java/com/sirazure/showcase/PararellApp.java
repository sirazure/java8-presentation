package com.sirazure.showcase;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class PararellApp {
    public static void main(String[] args) {
        List<Integer> integers = new Random().ints(1, 10000).limit(900000).boxed().collect(Collectors.toList());

        Instant start1 = Instant.now();
        integers.stream().sorted().collect(Collectors.toList());
        System.out.println(Duration.between(start1, Instant.now()).getNano());

        Instant start2 = Instant.now();
        integers.parallelStream().sorted().collect(Collectors.toList());
        System.out.println(Duration.between(start2, Instant.now()).getNano());


    }
}

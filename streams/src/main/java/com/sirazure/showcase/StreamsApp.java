package com.sirazure.showcase;


import com.sirazure.showcase.domain.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsApp {
    private static Logger logger = LoggerFactory.getLogger(StreamsApp.class);

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("joe", "doe", 21),
                new Person("John", "Smith", 33),
                new Person("Mary", "Smith", 33),
                new Person("Amy", "Flowers", 43));


        oldFilter(people);

        people.stream()
                .filter(p -> p.getFirstName().length() == 3)
                .forEach(System.out::println);


        oldCollecting(people);

        people.stream()
                .collect(Collectors.groupingBy(Person::getAge))
                .forEach((key, value) -> System.out.println("age :" + key + " have/has: " + value ));



    }

    private static void oldCollecting(List<Person> people) {
        Map<Integer, List<Person>> map = new LinkedHashMap<>();
        for (Person p : people) {
            if (!map.containsKey(p.getAge())) {
                map.put(p.getAge(), new ArrayList<>());
            }
            map.get(p.getAge()).add(p);
        }
        for (Map.Entry<Integer, List<Person>> entry : map.entrySet()) {
            System.out.println("age :" + entry.getKey() + " have/has: " + entry.getValue() );
        }
    }

    private static void oldFilter(List<Person> people) {
        List<Person> filtered = new ArrayList<>();
        for (Person p : people) {
            if (p.getFirstName().length() == 3) {
                filtered.add(p);
            }
        }
        for (Person p : filtered) {
            System.out.println(p);
        }
    }


}

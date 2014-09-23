package com.sirazure.showcase;


import com.sirazure.showcase.domain.Person;
import org.apache.commons.lang3.StringUtils;
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


        //oldFilter(people);

        people.stream()
                .filter(p -> p.getFirstName().length() == 3)
                .forEach(p -> logger.info(p.toString()));


        //oldCollecting(people);

        people.stream()
                .collect(Collectors.groupingBy(Person::getAge))
                .forEach((key, value) -> logger.info("age :" + key + " have/has: " + value ));

        int maxAge = people.stream()
                .map(Person::getAge)
                .reduce(0, (first, second) -> first > second ? first : second);
        logger.info("max age: " + maxAge);

        String names = people.stream().map(Person::getFirstName).collect(Collectors.joining(","));
        logger.info(names);

        double averageAge = people.stream().collect(Collectors.averagingInt(Person::getAge));
        logger.info("average age : " + averageAge);



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

package com.metod.training.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRun {

    public static void main(final String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("20");
        strList.add("20");
        strList.add("30");
        strList.add("20");
        strList.add("12");
        strList.add("30");
        strList.add("12");
        strList.add("12");
        strList.add("30");
        strList.add("32");
        strList.add("35");
        strList.add("350");
        strList.add("351");

        strList.forEach(System.out::println);

        System.out.println("------------");
        for (String stringLoc : strList) {
            System.out.println(stringLoc);
        }

        System.out.println("------------");
        //        strList.parallelStream()
        //               .sorted()
        //               .distinct()
        //               .skip(2)
        //               .forEach(System.out::println);

        //        strList.stream()
        //               .sorted()
        //               .distinct()
        //               .skip(1)
        //               .parallel()
        //               .filter(t -> t.length() > 2)
        //               .forEach(System.out::println);

        //        IntSummaryStatistics summaryStatisticsLoc = strList.stream()
        //                                                           .sorted()
        //                                                           .distinct()
        //                                                           .skip(1)
        //                                                           .peek(r -> System.out.println("Peek : " + r))
        //                                                           .filter(t -> t.length() > 2)
        //                                                           .mapToInt(s -> Integer.parseInt(s))
        //                                                           .summaryStatistics();
        List<Integer> collectLoc = strList.stream()
                                          .sorted()
                                          .distinct()
                                          .skip(1)
                                          .peek(r -> System.out.println("Peek : " + r))
                                          .filter(t -> t.length() > 2)
                                          .map(s -> Integer.parseInt(s))
                                          .collect(Collectors.toList());
        boolean anyMatchLoc = Stream.of("1",
                                        "2",
                                        "3",
                                        "5",
                                        "10")
                                    .sorted()
                                    .distinct()
                                    .anyMatch(r -> r.equals("5"));
        // .forEach(System.out::println);

    }
}

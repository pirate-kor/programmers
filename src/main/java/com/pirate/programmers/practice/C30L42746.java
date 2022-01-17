package com.pirate.programmers.practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class C30L42746 {
    public String solution(int[] numbers) {
//        return Arrays.stream(numbers).allMatch(i -> i == 0) ? "0" :
//                Arrays.stream(numbers).mapToObj(String::valueOf)
//                        .sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2))
//                        .collect(Collectors.joining());

        String result;
        
        return (result = Arrays.stream(numbers).mapToObj(String::valueOf)
                .sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2))
                .collect(Collectors.joining())).charAt(0) == '0' ? "0" : result;

    }
}

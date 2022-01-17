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

    /**
     * 테스트 1 〉	통과 (126.06ms, 113MB)
     * 테스트 2 〉	통과 (74.78ms, 93.9MB)
     * 테스트 3 〉	통과 (189.42ms, 136MB)
     * 테스트 4 〉	통과 (20.53ms, 82.2MB)
     * 테스트 5 〉	통과 (116.73ms, 123MB)
     * 테스트 6 〉	통과 (108.45ms, 119MB)
     * 테스트 7 〉	통과 (4.24ms, 84MB)
     * 테스트 8 〉	통과 (3.99ms, 74MB)
     * 테스트 9 〉	통과 (5.60ms, 79.5MB)
     * 테스트 10 〉	통과 (4.49ms, 72.4MB)
     * 테스트 11 〉	통과 (4.80ms, 76.9MB)
     * 테스트 12 〉	통과 (4.41ms, 78.4MB)
     * 테스트 13 〉	통과 (4.19ms, 72.9MB)
     * 테스트 14 〉	통과 (4.06ms, 75.9MB)
     * 테스트 15 〉	통과 (4.23ms, 74.8MB)
     */
}

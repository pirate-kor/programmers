package com.pirate.programmers.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C30L42578 {

    public int solution(String[][] clothes) {

        return Stream.of(clothes)
                .collect(Collectors.groupingBy(c -> c[1], Collectors.counting()))
                .values()
                .stream()
                .reduce(1L, (x, y) -> x * (y + 1))
                .intValue() - 1;
    }

    /**
     * 테스트 1 〉	통과 (5.48ms, 84MB)
     * 테스트 2 〉	통과 (5.77ms, 71.7MB)
     * 테스트 3 〉	통과 (5.24ms, 81.6MB)
     * 테스트 4 〉	통과 (6.51ms, 78.1MB)
     * 테스트 5 〉	통과 (7.23ms, 79MB)
     * 테스트 6 〉	통과 (6.67ms, 75.5MB)
     * 테스트 7 〉	통과 (7.42ms, 71.9MB)
     * 테스트 8 〉	통과 (8.08ms, 74.9MB)
     * 테스트 9 〉	통과 (5.37ms, 77MB)
     * 테스트 10 〉	통과 (6.48ms, 73.2MB)
     * 테스트 11 〉	통과 (6.11ms, 79.7MB)
     * 테스트 12 〉	통과 (7.08ms, 74.2MB)
     * 테스트 13 〉	통과 (7.93ms, 69.4MB)
     * 테스트 14 〉	통과 (5.84ms, 76.7MB)
     * 테스트 15 〉	통과 (6.09ms, 77.7MB)
     * 테스트 16 〉	통과 (5.16ms, 75.1MB)
     * 테스트 17 〉	통과 (7.27ms, 76.6MB)
     * 테스트 18 〉	통과 (6.83ms, 83.1MB)
     * 테스트 19 〉	통과 (4.80ms, 76.4MB)
     * 테스트 20 〉	통과 (4.71ms, 74.6MB)
     * 테스트 21 〉	통과 (6.62ms, 75.4MB)
     * 테스트 22 〉	통과 (4.43ms, 74.8MB)
     * 테스트 23 〉	통과 (4.80ms, 79.6MB)
     * 테스트 24 〉	통과 (4.59ms, 74.6MB)
     * 테스트 25 〉	통과 (4.61ms, 74.5MB)
     * 테스트 26 〉	통과 (5.08ms, 79.3MB)
     * 테스트 27 〉	통과 (6.77ms, 74.5MB)
     * 테스트 28 〉	통과 (4.74ms, 75.2MB)
     */

    public int solution_1(String[][] clothes) {
        var maps = new HashMap<String, List<String>>();
        for (int i = 0; i < clothes.length; i++) {
            maps.compute(
                    clothes[i][1],
                    (x, y) -> y == null ? new ArrayList<>() : y).add(clothes[i][0]);
        }

        return maps.values()
                .stream()
                .map(v -> v.size() + 1)
                .reduce(1, (x, y) -> x * y) - 1;
    }

    /**
     * 테스트 1 〉	통과 (1.29ms, 77.2MB)
     * 테스트 2 〉	통과 (1.13ms, 76MB)
     * 테스트 3 〉	통과 (1.10ms, 70.2MB)
     * 테스트 4 〉	통과 (1.73ms, 72.1MB)
     * 테스트 5 〉	통과 (1.56ms, 79.2MB)
     * 테스트 6 〉	통과 (1.15ms, 79.1MB)
     * 테스트 7 〉	통과 (1.41ms, 75.2MB)
     * 테스트 8 〉	통과 (1.49ms, 74.6MB)
     * 테스트 9 〉	통과 (1.66ms, 79.3MB)
     * 테스트 10 〉	통과 (0.98ms, 73.5MB)
     * 테스트 11 〉	통과 (1.22ms, 75.4MB)
     * 테스트 12 〉	통과 (1.64ms, 72.7MB)
     * 테스트 13 〉	통과 (1.59ms, 72.9MB)
     * 테스트 14 〉	통과 (1.15ms, 73.5MB)
     * 테스트 15 〉	통과 (1.44ms, 83MB)
     * 테스트 16 〉	통과 (1.05ms, 77.3MB)
     * 테스트 17 〉	통과 (1.12ms, 74.1MB)
     * 테스트 18 〉	통과 (1.11ms, 70.3MB)
     * 테스트 19 〉	통과 (1.83ms, 72.1MB)
     * 테스트 20 〉	통과 (1.16ms, 77.5MB)
     * 테스트 21 〉	통과 (1.76ms, 73.8MB)
     * 테스트 22 〉	통과 (1.59ms, 73MB)
     * 테스트 23 〉	통과 (1.74ms, 75.7MB)
     * 테스트 24 〉	통과 (1.41ms, 78.1MB)
     * 테스트 25 〉	통과 (1.56ms, 68.5MB)
     * 테스트 26 〉	통과 (1.60ms, 73.4MB)
     * 테스트 27 〉	통과 (1.28ms, 76.6MB)
     * 테스트 28 〉	통과 (1.19ms, 75.1MB)
     */
}

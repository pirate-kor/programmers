package com.pirate.programmers.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C30L92334 {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> counters = new HashMap<>();
        Map<String, Set<String>> results = new LinkedHashMap<>();
        Stream.of(id_list)
                .forEach(id -> results.put(id, new HashSet()));

        Stream.of(report)
                .distinct()
                .map(s -> s.split(" ")[1])
                .forEach(s -> {
                    counters.putIfAbsent(s, 0);
                    counters.computeIfPresent(s, (key, value) -> value + 1);
                });

        var abuse = counters.entrySet()
                .stream()
                .filter(e -> e.getValue() >= k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        Stream.of(report)
                .distinct()
                .forEach(s -> {
                    var arr = s.split(" ");
                    results.computeIfPresent(arr[0], (x, y) -> y).add(arr[1]);
                });

        return results.values()
                .stream()
                .map(strings -> strings
                        .stream()
                        .map(v -> abuse.contains(v) ? 1 : 0)
                        .reduce(Integer::sum))
                .mapToInt(i -> i.orElse(0))
                .toArray();
    }

    /**
     * 테스트 1 〉	통과 (6.07ms, 85.7MB)
     * 테스트 2 〉	통과 (5.84ms, 75.2MB)
     * 테스트 3 〉	통과 (336.40ms, 170MB)
     * 테스트 4 〉	통과 (6.49ms, 73MB)
     * 테스트 5 〉	통과 (6.72ms, 78.7MB)
     * 테스트 6 〉	통과 (12.26ms, 80.3MB)
     * 테스트 7 〉	통과 (19.45ms, 86.9MB)
     * 테스트 8 〉	통과 (25.83ms, 112MB)
     * 테스트 9 〉	통과 (174.11ms, 161MB)
     * 테스트 10 〉	통과 (198.97ms, 153MB)
     * 테스트 11 〉	통과 (271.05ms, 173MB)
     * 테스트 12 〉	통과 (9.60ms, 84.7MB)
     * 테스트 13 〉	통과 (10.05ms, 80.2MB)
     * 테스트 14 〉	통과 (168.62ms, 152MB)
     * 테스트 15 〉	통과 (226.56ms, 171MB)
     * 테스트 16 〉	통과 (8.64ms, 93.7MB)
     * 테스트 17 〉	통과 (15.71ms, 80.3MB)
     * 테스트 18 〉	통과 (13.47ms, 79.8MB)
     * 테스트 19 〉	통과 (18.91ms, 80.8MB)
     * 테스트 20 〉	통과 (133.12ms, 145MB)
     * 테스트 21 〉	통과 (191.27ms, 174MB)
     * 테스트 22 〉	통과 (5.89ms, 78.2MB)
     * 테스트 23 〉	통과 (6.43ms, 77.7MB)
     * 테스트 24 〉	통과 (8.32ms, 77.3MB)
     */
}

package com.pirate.programmers.practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class C30L77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        var winNums = Arrays.stream(win_nums)
                .boxed()
                .collect(Collectors.toList());

        var zeroCount = (int) Arrays.stream(lottos)
                .filter(i -> i == 0)
                .count();
        var matchCount = (int) Arrays.stream(lottos)
                .filter(winNums::contains)
                .count();

        return new int[]{getRank(matchCount + zeroCount), getRank(matchCount)};
    }

    private int getRank(int matchCount) {
        return Math.min(7 - matchCount, 6);
    }

    /**
     * 테스트 1 〉	통과 (3.43ms, 74MB)
     * 테스트 2 〉	통과 (3.78ms, 71.1MB)
     * 테스트 3 〉	통과 (2.91ms, 66.7MB)
     * 테스트 4 〉	통과 (3.10ms, 77.8MB)
     * 테스트 5 〉	통과 (3.67ms, 73.9MB)
     * 테스트 6 〉	통과 (4.35ms, 73.1MB)
     * 테스트 7 〉	통과 (3.69ms, 82.1MB)
     * 테스트 8 〉	통과 (3.04ms, 79.3MB)
     * 테스트 9 〉	통과 (4.36ms, 80.4MB)
     * 테스트 10 〉	통과 (4.04ms, 69.2MB)
     * 테스트 11 〉	통과 (3.63ms, 80.2MB)
     * 테스트 12 〉	통과 (3.22ms, 79.9MB)
     * 테스트 13 〉	통과 (3.60ms, 77.3MB)
     * 테스트 14 〉	통과 (2.76ms, 80.1MB)
     * 테스트 15 〉	통과 (4.09ms, 76.1MB)
     */
}

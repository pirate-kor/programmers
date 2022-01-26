package com.pirate.programmers.practice;

import java.util.Arrays;

public class C30L86051 {
    public int solution(int[] numbers) {
        // 0 + .. + 9 = 45
        return 45 - Arrays.stream(numbers)
                .distinct()
                .sum();
    }

    /**
     * 테스트 1 〉	통과 (1.64ms, 73MB)
     * 테스트 2 〉	통과 (2.34ms, 77.8MB)
     * 테스트 3 〉	통과 (1.71ms, 74.3MB)
     * 테스트 4 〉	통과 (2.03ms, 74.8MB)
     * 테스트 5 〉	통과 (1.64ms, 74.5MB)
     * 테스트 6 〉	통과 (1.73ms, 83.5MB)
     * 테스트 7 〉	통과 (1.80ms, 74.4MB)
     * 테스트 8 〉	통과 (1.96ms, 73.8MB)
     * 테스트 9 〉	통과 (1.86ms, 74.3MB)
     */
}

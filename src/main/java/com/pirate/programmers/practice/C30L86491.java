package com.pirate.programmers.practice;

public class C30L86491 {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;
        for (int[] size : sizes) {
            maxWidth = Math.max(maxWidth, Math.max(size[0], size[1]));
            maxHeight = Math.max(maxHeight, Math.min(size[0], size[1]));
        }

        return maxWidth * maxHeight;
    }
}

/**
 * 테스트 1 〉	통과 (0.03ms, 73.8MB)
 * 테스트 2 〉	통과 (0.03ms, 77.5MB)
 * 테스트 3 〉	통과 (0.04ms, 70MB)
 * 테스트 4 〉	통과 (0.05ms, 71.7MB)
 * 테스트 5 〉	통과 (0.05ms, 74.6MB)
 * 테스트 6 〉	통과 (0.03ms, 76.8MB)
 * 테스트 7 〉	통과 (0.05ms, 70.8MB)
 * 테스트 8 〉	통과 (0.05ms, 75.3MB)
 * 테스트 9 〉	통과 (0.05ms, 74.4MB)
 * 테스트 10 〉	통과 (0.05ms, 74.1MB)
 * 테스트 11 〉	통과 (0.05ms, 83.2MB)
 * 테스트 12 〉	통과 (0.09ms, 69.3MB)
 * 테스트 13 〉	통과 (0.14ms, 78.7MB)
 * 테스트 14 〉	통과 (0.31ms, 82MB)
 * 테스트 15 〉	통과 (0.50ms, 81.6MB)
 * 테스트 16 〉	통과 (0.64ms, 83.9MB)
 * 테스트 17 〉	통과 (0.89ms, 81.9MB)
 * 테스트 18 〉	통과 (1.00ms, 94.8MB)
 * 테스트 19 〉	통과 (1.09ms, 85.5MB)
 * 테스트 20 〉	통과 (1.34ms, 88.1MB)
 */
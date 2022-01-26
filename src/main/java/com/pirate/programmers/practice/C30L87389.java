package com.pirate.programmers.practice;

public class C30L87389 {
    public int solution(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 1) return i;
        }

        return n - 1;
    }
}

/**
 * 테스트 1 〉	통과 (4.44ms, 75.5MB)
 * 테스트 2 〉	통과 (0.01ms, 66.7MB)
 * 테스트 3 〉	통과 (0.01ms, 66MB)
 * 테스트 4 〉	통과 (0.01ms, 73.5MB)
 * 테스트 5 〉	통과 (0.03ms, 67MB)
 * 테스트 6 〉	통과 (0.02ms, 75.2MB)
 * 테스트 7 〉	통과 (0.03ms, 67.4MB)
 * 테스트 8 〉	통과 (0.01ms, 75.4MB)
 * 테스트 9 〉	통과 (0.01ms, 76.5MB)
 * 테스트 10 〉	통과 (0.02ms, 73.1MB)
 * 테스트 11 〉	통과 (0.04ms, 77.6MB)
 */

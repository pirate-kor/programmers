package com.pirate.programmers.practice;

public class C30L42842 {
    public int[] solution(int brown, int yellow) {
        int width = (yellow + 2) / 2;

        brown -= 4;
        for (int i = 1; i < width; i++) {
            if (yellow % i == 0) {
                System.out.println((i + yellow / i) * 2);
            }
            if (yellow % i == 0 && ((i + yellow / i) * 2 == brown)) {
                return new int[]{(yellow / i) + 2, i + 2};
            }
        }

        return new int[]{3, 3};
    }

    /**
     * 테스트 1 〉	통과 (0.19ms, 74.8MB)
     * 테스트 2 〉	통과 (0.15ms, 75.2MB)
     * 테스트 3 〉	통과 (0.50ms, 75.7MB)
     * 테스트 4 〉	통과 (0.16ms, 72.7MB)
     * 테스트 5 〉	통과 (0.18ms, 76.6MB)
     * 테스트 6 〉	통과 (0.31ms, 73.4MB)
     * 테스트 7 〉	통과 (0.96ms, 72.4MB)
     * 테스트 8 〉	통과 (1.01ms, 79MB)
     * 테스트 9 〉	통과 (0.97ms, 73.6MB)
     * 테스트 10 〉	통과 (1.05ms, 73.8MB)
     * 테스트 11 〉	통과 (0.01ms, 77.7MB)
     * 테스트 12 〉	통과 (0.20ms, 83.3MB)
     * 테스트 13 〉	통과 (0.23ms, 73MB)
     */
}

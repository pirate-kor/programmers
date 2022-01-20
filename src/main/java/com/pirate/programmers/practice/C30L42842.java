package com.pirate.programmers.practice;

public class C30L42842 {
    public int[] solution(int brown, int yellow) {
        int width = (yellow + 2) / 2;

        brown -= 4;
        for (int i = 1; i < width; i++) {
            if (yellow % i == 0 && ((i + yellow / i) * 2 == brown)) {
                return new int[]{(yellow / i) + 2, i + 2};
            }
        }

        return new int[]{3, 3};
    }

    /**
     * 테스트 1 〉	통과 (0.01ms, 74.3MB)
     * 테스트 2 〉	통과 (0.01ms, 73.5MB)
     * 테스트 3 〉	통과 (0.05ms, 77.7MB)
     * 테스트 4 〉	통과 (0.02ms, 74.9MB)
     * 테스트 5 〉	통과 (0.02ms, 73.5MB)
     * 테스트 6 〉	통과 (0.03ms, 70.8MB)
     * 테스트 7 〉	통과 (0.03ms, 86.3MB)
     * 테스트 8 〉	통과 (0.08ms, 81.5MB)
     * 테스트 9 〉	통과 (0.03ms, 68.7MB)
     * 테스트 10 〉	통과 (0.04ms, 75.6MB)
     * 테스트 11 〉	통과 (0.02ms, 82MB)
     * 테스트 12 〉	통과 (0.01ms, 72.6MB)
     * 테스트 13 〉	통과 (0.02ms, 79.4MB)
     */
}

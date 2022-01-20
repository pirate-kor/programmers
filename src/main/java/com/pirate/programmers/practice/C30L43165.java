package com.pirate.programmers.practice;

public class C30L43165 {
    private int count = 0;
    public int solution(int[] numbers, int target) {
        getNumber(numbers, 0, 0, target);

        return count;
    }

    private void getNumber(int[] numbers, int index, int result, int target) {
        if (index == numbers.length) {
            if (result == target) count++;
            return ;
        }
        getNumber(numbers, index + 1, result + numbers[index], target);
        getNumber(numbers, index + 1, result - numbers[index], target);
    }

    /**
     * 테스트 1 〉	통과 (5.01ms, 73.6MB)
     * 테스트 2 〉	통과 (5.22ms, 74.6MB)
     * 테스트 3 〉	통과 (0.25ms, 75.2MB)
     * 테스트 4 〉	통과 (0.34ms, 74.1MB)
     * 테스트 5 〉	통과 (0.72ms, 76.5MB)
     * 테스트 6 〉	통과 (0.36ms, 72.5MB)
     * 테스트 7 〉	통과 (0.18ms, 72MB)
     * 테스트 8 〉	통과 (0.48ms, 69.4MB)
     */
}

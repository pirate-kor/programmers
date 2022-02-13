package com.pirate.programmers.practice;


import java.util.Arrays;
import java.util.stream.Collectors;

public class C30L42577{
    public boolean solution(String[] phone_book) {
        var list = Arrays.stream(phone_book)
                .sorted()
                .collect(Collectors.toList());

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1).startsWith(list.get(i))) {
                return false;
            }
        }

        return true;
    }

    /**
     * 정확성
     * 테스트 1 〉	통과 (3.47ms, 73.8MB)
     * 테스트 2 〉	통과 (1.36ms, 75.5MB)
     * 테스트 3 〉	통과 (1.34ms, 77.5MB)
     * 테스트 4 〉	통과 (1.25ms, 76.3MB)
     * 테스트 5 〉	통과 (1.94ms, 79.9MB)
     * 테스트 6 〉	통과 (1.36ms, 75.5MB)
     * 테스트 7 〉	통과 (1.27ms, 68.7MB)
     * 테스트 8 〉	통과 (1.36ms, 67MB)
     * 테스트 9 〉	통과 (1.82ms, 75.1MB)
     * 테스트 10 〉	통과 (1.98ms, 79.9MB)
     * 테스트 11 〉	통과 (1.55ms, 74.8MB)
     * 테스트 12 〉	통과 (1.76ms, 75.2MB)
     * 테스트 13 〉	통과 (1.30ms, 77.6MB)
     * 테스트 14 〉	통과 (4.63ms, 76.8MB)
     * 테스트 15 〉	통과 (4.27ms, 80.3MB)
     * 테스트 16 〉	통과 (6.79ms, 84.2MB)
     * 테스트 17 〉	통과 (6.47ms, 93.4MB)
     * 테스트 18 〉	통과 (7.95ms, 85.4MB)
     * 테스트 19 〉	통과 (6.14ms, 84.7MB)
     * 테스트 20 〉	통과 (7.08ms, 76MB)
     *
     * 효율성
     * 테스트 1 〉	통과 (20.13ms, 57MB)
     * 테스트 2 〉	통과 (31.50ms, 56.9MB)
     * 테스트 3 〉	통과 (377.08ms, 116MB)
     * 테스트 4 〉	통과 (242.39ms, 97.8MB)
     */
}

package com.pirate.programmers.practice;

import java.util.TreeSet;

public class C30L42839 {
    private final TreeSet<Integer> sets = new TreeSet<>();
    public void permutation(String s1, String s2) {
        if (!s1.equals("")) {
            sets.add(Integer.valueOf(s1));
        }
        for (int i = 0; i < s2.length(); i++) {
            permutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1));
        }
    }

    public int solution(String str) {
        permutation("", str);

        var array = new int[sets.last() + 1];

        for (int i = 0; i < array.length; i++) {
            if (i == 0 || i == 1) {
                array[i] = -1;
                continue;
            }
            for (int j = i + i; j < array.length; j += i) {
                array[j] = -1;
            }
        }

        return (int) sets.stream()
                .filter(i -> array[i] != -1)
                .count();
    }

    /**
     * 테스트 1 〉	통과 (10.86ms, 70.3MB)
     * 테스트 2 〉	통과 (43.88ms, 84.9MB)
     * 테스트 3 〉	통과 (11.50ms, 75.6MB)
     * 테스트 4 〉	통과 (27.02ms, 85.9MB)
     * 테스트 5 〉	통과 (248.80ms, 112MB)
     * 테스트 6 〉	통과 (15.43ms, 79.8MB)
     * 테스트 7 〉	통과 (13.08ms, 77.2MB)
     * 테스트 8 〉	통과 (553.70ms, 108MB)
     * 테스트 9 〉	통과 (10.40ms, 68.3MB)
     * 테스트 10 〉	통과 (63.44ms, 96.9MB)
     * 테스트 11 〉	통과 (23.82ms, 85.4MB)
     * 테스트 12 〉	통과 (18.54ms, 79.3MB)
     */
}

package com.pirate.programmers.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class C30L42888 {
    public String[] solution(String[] record) {
        HashMap<String, String> ids = new HashMap<>();
        ArrayList<String[]> history = new ArrayList<>();
        for (String s : record) {
            String[] recordArr = s.split(" ");
            if ("Enter".equals(recordArr[0])) {
                ids.put(recordArr[1], recordArr[2]);
                history.add(new String[]{"E", recordArr[1]});
            } else if ("Leave".equals(recordArr[0])) {
                history.add(new String[]{"L", recordArr[1]});
            } else {
                ids.put(recordArr[1], recordArr[2]);
            }
        }

        var result = new String[history.size()];
        for (int i = 0; i < history.size(); i++) {
            String[] h = history.get(i);
            if (h[0].equals("E")) {
                result[i] = ids.get(h[1]) + "님이 들어왔습니다.";
            } else {
                result[i] = ids.get(h[1]) + "님이 나갔습니다.";
            }
        }

        return result;
    }
}


/**
 * 테스트 1 〉	통과 (2.36ms, 77.4MB)
 * 테스트 2 〉	통과 (3.20ms, 83.2MB)
 * 테스트 3 〉	통과 (3.49ms, 79.6MB)
 * 테스트 4 〉	통과 (2.68ms, 78.2MB)
 * 테스트 5 〉	통과 (7.60ms, 82.9MB)
 * 테스트 6 〉	통과 (6.09ms, 77.7MB)
 * 테스트 7 〉	통과 (4.59ms, 80.2MB)
 * 테스트 8 〉	통과 (6.68ms, 81.7MB)
 * 테스트 9 〉	통과 (5.70ms, 75.7MB)
 * 테스트 10 〉	통과 (6.74ms, 88.3MB)
 * 테스트 11 〉	통과 (4.00ms, 76.5MB)
 * 테스트 12 〉	통과 (5.99ms, 76.9MB)
 * 테스트 13 〉	통과 (7.04ms, 79.4MB)
 * 테스트 14 〉	통과 (4.81ms, 78MB)
 * 테스트 15 〉	통과 (2.23ms, 73.5MB)
 * 테스트 16 〉	통과 (2.07ms, 74.5MB)
 * 테스트 17 〉	통과 (2.91ms, 77.9MB)
 * 테스트 18 〉	통과 (3.83ms, 89.6MB)
 * 테스트 19 〉	통과 (5.06ms, 80.7MB)
 * 테스트 20 〉	통과 (6.82ms, 80.6MB)
 * 테스트 21 〉	통과 (6.23ms, 82.4MB)
 * 테스트 22 〉	통과 (4.53ms, 75.2MB)
 * 테스트 23 〉	통과 (4.68ms, 81.8MB)
 * 테스트 24 〉	통과 (4.96ms, 89.2MB)
 * 테스트 25 〉	통과 (81.34ms, 182MB)
 * 테스트 26 〉	통과 (92.67ms, 188MB)
 * 테스트 27 〉	통과 (96.11ms, 213MB)
 * 테스트 28 〉	통과 (111.45ms, 190MB)
 * 테스트 29 〉	통과 (105.51ms, 212MB)
 * 테스트 30 〉	통과 (93.39ms, 193MB)
 * 테스트 31 〉	통과 (70.51ms, 186MB)
 * 테스트 32 〉	통과 (70.88ms, 183MB)
 */

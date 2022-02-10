package com.pirate.programmers.practice;

public class C30L60058 {
    public String solution(String p) {
        var statusIndex = 0;
        var wrongCount = 0;
        StringBuilder result = new StringBuilder();
        StringBuilder tempBucket = new StringBuilder();

        for (char c : p.toCharArray()) {
            if (c == '(') {
                statusIndex++;
                tempBucket.append('(');
            } else {
                statusIndex--;
                tempBucket.append(')');
                if (statusIndex < 0) wrongCount++;
            }

            if (statusIndex == 0) {
                if (wrongCount == 0) {
                    result.append(tempBucket);
                    tempBucket = new StringBuilder();
                } else {
                    result.append(makeBucket("", wrongCount));
                    tempBucket = new StringBuilder();
                    wrongCount = 0;
                }
            }
        }

        return result.toString();
    }

    private String makeBucket(String bucket, int count) {
        if (count == 0) {
            return bucket;
        } else {
            return makeBucket("(" + bucket + ")", count - 1);
        }
    }
}

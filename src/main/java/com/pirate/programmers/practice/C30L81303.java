package com.pirate.programmers.practice;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class C30L81303 {

    public String solution(int n, int k, String[] cmd) {
        Stack<Integer> stack = new Stack<>();

        var boolArr = new Boolean[n];
        for (int i = 0; i < n; i++) {
            boolArr[i] = true;
        }

        for (String c : cmd) {
            char[] chars = c.toCharArray();
            switch (chars[0]) {
                case 'C':
                    boolArr[k] = false;
                    k = clearIndex(boolArr, stack, k);
                    break;
                case 'D':
                    k = moveDown(boolArr, chars[2] - '0', k);
                    break;
                case 'U':
                    k = moveUp(boolArr, chars[2] - '0', k);
                    break;
                case 'Z':
                    if (!stack.empty()) {
                        boolArr[stack.pop()] = true;
                    }
                    break;
            }
        }

        return Arrays.stream(boolArr)
                .map(b -> b ? "O" : "X")
                .collect(Collectors.joining());
    }

    private int clearIndex(Boolean[] arr, Stack<Integer> stack, int currentIndex) {
        stack.push(currentIndex);
        arr[currentIndex] = false;
        for (int i = currentIndex + 1; i < arr.length; i++) {
            if (arr[i]) {
                return i;
            }
        }
        for (int i = currentIndex - 1; i >= 0; i--) {
            if (arr[i]) {
                return i;
            }
        }
        return -1;
    }

    private int moveUp(Boolean[] arr, int moveIndex, int currentIndex) {
        int index = 0;
        for (int i = currentIndex - 1; i >= 0; i--) {
            if (arr[i]) {
                index++;
            }
            if (index == moveIndex) {
                return i;
            }
        }
        return currentIndex;
    }

    private int moveDown(Boolean[] arr, int moveIndex, int currentIndex) {
        int index = 0;
        for (int i = currentIndex + 1; i < arr.length; i++) {
            if (arr[i]) {
                index++;
            }
            if (index == moveIndex) {
                return i;
            }
        }
        return currentIndex;
    }

}

package com.pirate.programmers;

import com.pirate.programmers.practice.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgrammersApplicationTests {

    @Test
    public void testC30L42746() {
        var numbers_1 = new int[]{6, 10, 2};
        var numbers_2 = new int[]{3, 30, 34, 5, 9};
        var numbers_3 = new int[]{0, 0, 0};

        assertEquals(new C30L42746().solution(numbers_1), "6210");
        assertEquals(new C30L42746().solution(numbers_2), "9534330");
        assertEquals(new C30L42746().solution(numbers_3), "0");
    }

    @Test
    public void testC30L92334() {
        assertArrayEquals(new C30L92334().solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}, 2), new int[]{2,1,1,0});
        assertArrayEquals(new C30L92334().solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 3), new int[]{0,0});
    }

    @Test
    public void testC30L42839() {
        assertEquals(new C30L42839().solution("17"), 3);
        assertEquals(new C30L42839().solution("011"), 2);
    }

    @Test
    public void testC30L42578() {
        assertEquals(new C30L42578().solution(new String[][]{{"yellowhat", "headgear"},{"bluesunglasses", "eyewear"},{"green_turban", "headgear"}}), 5);
        assertEquals(new C30L42578().solution(new String[][]{{"crowmask", "face"},{"bluesunglasses", "face"},{"smoky_makeup", "face"}}), 3);
    }

    @Test
    public void testC30L43165() {
        assertEquals(new C30L43165().solution(new int[]{1, 1, 1, 1, 1}, 3), 5);
    }

    @Test
    public void testC30L42842() {
        assertArrayEquals(new C30L42842().solution(10, 2), new int[]{4, 3});
        assertArrayEquals(new C30L42842().solution(8, 1), new int[]{3, 3});
        assertArrayEquals(new C30L42842().solution(24, 24), new int[]{8, 6});
    }

    @Test
    public void testC30L77484() {
        assertArrayEquals(new C30L77484().solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19}), new int[]{3, 5});
        assertArrayEquals(new C30L77484().solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25}), new int[]{1, 6});
        assertArrayEquals(new C30L77484().solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35}), new int[]{1, 1});
    }
}

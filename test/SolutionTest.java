

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {


    @Test
    public void testGetTotalX_case1() {
        List<Integer> a = Arrays.asList(2, 4);
        List<Integer> b = Arrays.asList(16, 32, 96);
        int expected = 3;
        int actual = Solution.getTotalX(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetTotalX_case2() {
        List<Integer> a = Arrays.asList(2, 3);
        List<Integer> b = Arrays.asList(6, 12);
        int expected = 1;
        int actual = Solution.getTotalX(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetTotalX_case3() {
        List<Integer> a = Arrays.asList(1);
        List<Integer> b = Arrays.asList(100);
        int expected = 9;
        int actual = Solution.getTotalX(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetTotalX_case4() {
        List<Integer> a = Arrays.asList(3, 4);
        List<Integer> b = Arrays.asList(24, 48);
        int expected = 2;
        int actual = Solution.getTotalX(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetTotalX_case5() {
        List<Integer> a = Arrays.asList(2, 6);
        List<Integer> b = Arrays.asList(24, 36);
        int expected = 2;
        int actual = Solution.getTotalX(a, b);
        assertEquals(expected, actual);
    }


}
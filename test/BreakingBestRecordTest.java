import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BreakingBestRecordTest {



    @Test
    public void testBreakingRecords_case1() {
        List<Integer> scores = List.of(10, 5, 20, 20, 4, 5, 2, 25, 1);
        List<Integer> expected = List.of(2, 4);
        List<Integer> actual = BreakingBestRecord.breakingRecords(scores);
        assertEquals(expected, actual);
    }

    @Test
    public void testBreakingRecords_case2() {
        List<Integer> scores = List.of(12, 24, 10, 24);
        List<Integer> expected = List.of(1, 1);
        List<Integer> actual = BreakingBestRecord.breakingRecords(scores);
        assertEquals(expected, actual);
    }

    @Test
    public void testBreakingRecords_case3() {
        List<Integer> scores = List.of(100);
        List<Integer> expected = List.of(0, 0);
        List<Integer> actual = BreakingBestRecord.breakingRecords(scores);
        assertEquals(expected, actual);
    }

    @Test
    public void testBreakingRecords_case4() {
        List<Integer> scores = List.of(50, 50, 50, 50);
        List<Integer> expected = List.of(0, 0);
        List<Integer> actual = BreakingBestRecord.breakingRecords(scores);
        assertEquals(expected, actual);
    }

    @Test
    public void testBreakingRecords_case5() {
        List<Integer> scores = List.of(5, 4, 3, 2, 1);
        List<Integer> expected = List.of(0, 4);
        List<Integer> actual = BreakingBestRecord.breakingRecords(scores);
        assertEquals(expected, actual);
    }

    @Test
    public void testBreakingRecords_case6() {
        List<Integer> scores = List.of(1, 2, 3, 4, 5);
        List<Integer> expected = List.of(4, 0);
        List<Integer> actual = BreakingBestRecord.breakingRecords(scores);
        assertEquals(expected, actual);
    }

}
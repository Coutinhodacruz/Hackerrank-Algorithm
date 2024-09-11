import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class MigratoryBirdsTest {

    @Test
    public void testMostFrequentBird() {

        List<Integer> arr = Arrays.asList(1, 4, 4, 4, 5, 3);
        int result = MigratoryBirds.migratoryBirds(arr);
        assertEquals(4, result);
    }

    @Test
    public void testTieWithSmallestId() {

        List<Integer> arr = Arrays.asList(1, 1, 2, 2, 3);
        int result = MigratoryBirds.migratoryBirds(arr);
        assertEquals(1, result);
    }

    @Test
    public void testAllBirdsEqualFrequency() {

        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        int result = MigratoryBirds.migratoryBirds(arr);
        assertEquals(1, result);
    }

    @Test
    public void testSingleBirdType() {

        List<Integer> arr = Arrays.asList(3, 3, 3, 3, 3);
        int result = MigratoryBirds.migratoryBirds(arr);
        assertEquals(3, result);
    }

    @Test
    public void testEdgeCaseMinListSize() {

        List<Integer> arr = Arrays.asList(2);
        int result = MigratoryBirds.migratoryBirds(arr);
        assertEquals(2, result);
    }

    @Test
    public void testEdgeCaseMaxListSize() {

        List<Integer> arr = Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5);
        int result = MigratoryBirds.migratoryBirds(arr);
        assertEquals(5, result);
    }
}

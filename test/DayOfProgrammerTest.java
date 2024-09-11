import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DayOfProgrammerTest {

    @Test
    public void testDayOfProgrammerForLeapYearInJulianCalendar() {

        assertEquals("12.09.1704", DayOfProgrammer.dayOfProgrammer(1704));
    }

    @Test
    public void testDayOfProgrammerForNonLeapYearInJulianCalendar() {

        assertEquals("12.09.1700", DayOfProgrammer.dayOfProgrammer(1700));
    }

    @Test
    public void testDayOfProgrammerForLeapYearInGregorianCalendar() {

        assertEquals("12.09.2000", DayOfProgrammer.dayOfProgrammer(2000));
    }

    @Test
    public void testDayOfProgrammerForNonLeapYearInGregorianCalendar() {

        assertEquals("13.09.2017", DayOfProgrammer.dayOfProgrammer(2017));
    }

    @Test
    public void testDayOfProgrammerForTransitionYear1918() {

        assertEquals("26.09.1918", DayOfProgrammer.dayOfProgrammer(1918));
    }

    @Test
    public void testDayOfProgrammerForLeapYearBefore1918() {

        assertEquals("12.09.1800", DayOfProgrammer.dayOfProgrammer(1800));
    }

    @Test
    public void testDayOfProgrammerForNonLeapYearBefore1918() {

        assertEquals("13.09.1801", DayOfProgrammer.dayOfProgrammer(1801));
    }

    @Test
    public void testDayOfProgrammerForLeapYearAfter1918() {

        assertEquals("12.09.2400", DayOfProgrammer.dayOfProgrammer(2400));
    }

    @Test
    public void testDayOfProgrammerForNonLeapYearAfter1918() {

        assertEquals("13.09.2005", DayOfProgrammer.dayOfProgrammer(2005));
    }
}

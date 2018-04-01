package testex;

import java.util.Date;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cherry Rose Semeña
 */
public class DateFormatterTest {

    private IDateFormatter df;

    public DateFormatterTest() {
    }

    @Before
    public void setup() {
        df = new DateFormatter();
    }

    @Test
    public void testGetFormattedDate() throws Exception {
        String expected = "31 Mar 2018 11:08 PM";
        assertThat(df.getFormattedDate("Europe/Copenhagen", new Date(2018 - 1900, 2, 31, 23, 8)), is(expected));
    }

    @Test(expected = JokeException.class)
    public void testJokeException() throws JokeException {
        df.getFormattedDate("unknown timezone", new Date());
    }
}

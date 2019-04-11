import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void Testtest() {
        MessageBulider ms = new MessageBulider();
        assertEquals("Hello World", ms.getMessage() );
    }
}
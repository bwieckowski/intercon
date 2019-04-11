import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void Testtest() {
        MessageBulider ms = new MessageBulider();
        assertEquals("Hello World", ms.getMessage() );
    }
}
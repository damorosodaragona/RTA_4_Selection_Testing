
import org.junit.BeforeClass;
import org.junit.Test;
import sootTest.object;

import static org.junit.Assert.assertEquals;

public class objectTest {
    private object ob;

    @BeforeClass
    public void setUp() {
        ob = new object();
    }

    @Test
    public void testField() {
        ob = new object();
        assertEquals("final field", ob.getFinalField());

    }

    @Test
    public void testFoo() {
        assertEquals(1, ob.foo());
    }
}

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class sootexampleTestJUnit4 {
    ArrayList<String> a;

    @Before
    public void init() {
        a = new ArrayList<>();
        a.add("pass");
    }

    @Before
    public void setUp() {
        a = new ArrayList<>();
        a.add("pass");
    }

    @BeforeClass
    public static void beforeAll() {
    }

    @Test
    public void succeedingStandardTest() {
        assertTrue(a.contains("pass"));
    }

    @Test
    public void succeedingGroupedTest() {

         assertTrue(a.contains("pass"));
         assertFalse(a.contains("groupedPass"));
        assertTrue(a.contains("pass"));
    }

    @Test
    public void failingTest() {
        assertTrue(a.contains("fall"));
    }

    @Test
    @Ignore("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    @After
    public void tearDown() {
        a.remove("pass");
        ;
    }

    @AfterClass
    public static void tearDownAll() {
        fail("only for demostration");
    }

    @Test
    public void dependentFailAssertion() {

                    assertNotNull(a);
                    assertTrue(a.contains("pass"));

                    assertTrue(a.contains("fail"));

                   assertNotNull(a.get(2));
                   assertEquals("fail", a.get(2));


    }

    public void noTest(){

    }

    public void noTest1(){

    }


    @Before
    public void setUpOverride(){

    }

    @After
    public void tearDownOverride(){

    }
    @Test
    public void testOverride(){

    }

    @Test
    public void dependentPassAssertion() {
        a.add("fail");

                    assertNotNull(a);
                    assertTrue(a.contains("pass"));

                    assertTrue(a.contains("fail"));

                    assertNotNull(a.get(1));
                    assertEquals("fail", a.get(1));


    }

}



import org.junit.Test;
import sootTest.FirstClass;

public class HierarchyTest {
    @Test
    public void testChangedHierarchy(){
        new FirstClass().foo();
    }
    @Test
    public void testEqualHierarchy(){
        new FirstClass().fooEqual();
    }



}

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.fail;

public class tearDownChanged {
    @After
    public void tearDown(){
        new ArrayList<>();
    }

    @Test
    public void toAddForChangeInTearDownEqual(){
        fail("to implement");
    }

    @Test
    public void toAddForChangeInTearDownDifferent(){
        Assert.assertTrue(true);
    }


}

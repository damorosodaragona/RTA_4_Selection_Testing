import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sootTest.sootexample;

import java.util.ArrayList;

import static junit.framework.Assert.fail;

public class tearDownChanged {
    @After
    public void tearDown(){
        sootexample sc = new sootexample();

    }

    @Test
    public void toAddForChangeInTearDownEqual(){
        fail("to implement");
    }

    @Test
    public void toAddForChangeInTearDownDifferent(){
        Assert.assertTrue(false);
    }


}

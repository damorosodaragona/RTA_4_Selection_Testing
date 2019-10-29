
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sootTest.sootexample;

public class ExtendedAbstractClass extends AbstractTestClass {

    @Override
    public void setUp(){

    }

    @Override
    @Test
    public void abstractMethod() {
        Assert.assertTrue(false);
    }

    @Override
    @Test
    public void concreteMethodOverrided(){
        Assert.fail();
    }

    @Override
    @Test
    public void abstractMethodThatTestDifferentMethod() {
        sootexample.differentStaticFinalMethod();
    }

    @Override
    public void concreteMethodOverriddenNotTaggedWithTest(){
        sootexample sc = new sootexample();
        sc.c();
    }
}

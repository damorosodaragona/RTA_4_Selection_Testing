import org.junit.Before;
import org.junit.Test;
import sootTest.sootexample;

import java.util.ArrayList;

public abstract class AbstractTestClass {
    @Before
    public void setUp(){

    }

    @Test
    public abstract void abstractMethod();

    @Test
    public void concreteMethodNotOverrided(){
        sootexample sc = new sootexample();
    }

    @Test
    public void concreteMethodOverrided(){
        sootexample sc = new sootexample();
        ArrayList k = new ArrayList();
    }
    @Test
    public abstract void abstractMethodThatTestDifferentMethod();

    @Test
    public void concreteMethodThatTestDifferentMethod(){
        new sootexample().differenceInPrivateMethod();
    }

    @Test
    public void concreteMethodThatTestDifferentMethodNotOverrided(){ new sootexample().c();

    }
    @Test
    public void concreteDifferentMethodThatTestDifferentMethodNotOverrided(){ new sootexample().differenceInPrivateMethod();}


    @Test
    public void concreteMethodOverridedOnlyByExtendAbstractClass2(){
        sootexample sc = new sootexample();
        ArrayList k = new ArrayList();
    }
}

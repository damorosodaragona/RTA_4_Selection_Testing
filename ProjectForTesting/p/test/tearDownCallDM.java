import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sootTest.sootexample;

public class tearDownCallDM {

    @After
    public void tearDown(){
        sootexample sc = new sootexample();
        sc.c();
    }

    @Test
    public void test_1(){

    }

    @Test
    public void test_2(){

    }

    @Test
    public void test_3(){

    }
}

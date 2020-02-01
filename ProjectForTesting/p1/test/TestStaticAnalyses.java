import org.junit.Test;
import sootTest.A;
import sootTest.B;
import sootTest.C;
import sootTest.Obj;

public class TestStaticAnalyses {

    public A a;
    public B b;
    public C c;

    @Test
    public void testA(){
        a = new A();
        new Obj().foo(a);

    }

    @Test
    public void testB(){
        b = new B();
        new Obj().foo(b);

    }

    @Test
    public void testC(){
        c = new C();
        new Obj().foo(c);

    }

}

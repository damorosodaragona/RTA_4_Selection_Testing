import org.junit.Test;
import sootTest.sootexample;

public class TestClassWIthInnerClass {

    public int getCount() {
        return 1;
    }

    @Test
    public void test() {
        for (int i = 0; i < getCount(); i++) {
            sootexample st = new sootexample();
            st.c();
        }
    }

    @Test
    public void testInInnerClass() {
        TestClassWIthInnerClass tcwic = new TestClassWIthInnerClass() {
            @Override
            public int getCount() {
                return 2;
            }
        };

        tcwic.test();
    }

    @Test
    public void testInInnerClass3() {
        TestClassWIthInnerClass tcwic = new TestClassWIthInnerClass() {
            @Override
            public int getCount() {
                return 2;
            }
            @org.junit.Test
            public void test(){
                sootexample st = new sootexample();
                st.c();
            }
        };

        tcwic.test();
    }

    class innerClass{
        @Test
        public void testInInnerClass2(){
            sootexample st = new sootexample();
            st.c();
        }

    }
}

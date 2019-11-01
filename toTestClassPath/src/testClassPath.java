import java.util.ArrayList;



import static org.easymock.EasyMock.*;



public class testClassPath {
    private ClassUnderTest classUnderTest;

    private Collaborator mock;

    private int i ;
    public ArrayList<String> s;
    private Object obj;

    public ArrayList<String> getS() {
        return s;
    }

    public void setS(ArrayList<String> s) {
        this.s = s;
    }



    public testClassPath(Object obj){
        this.obj = obj;
        i = 3;
        s = new ArrayList();
        s.add("hello");
    }

    public void toUseEasyMock(){
        mock = mock(Collaborator.class); // 1
        classUnderTest = new ClassUnderTest();
        classUnderTest.setListener(mock);
    }
}

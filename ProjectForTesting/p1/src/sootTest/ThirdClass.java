package sootTest;

public class ThirdClass extends SecondClass {
    @Override
    public int foo(){

        return 0;
    }

    @Override
    public void fooEqual() {
        int x = 1;
        for (int i = 0; i < 10; i++) {
            x += 2;
        }
    }
}

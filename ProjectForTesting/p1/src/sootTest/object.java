package sootTest;

;

public class object {

    private static String staticField = "static field p1";
    private final String finalField;
    private String normalField;

    public object() {

        finalField = "final field";
        normalField = "normal field P1";
    }


    public static String getStaticField() {
        return staticField;
    }

    public String getFinalField() {
        return finalField;
    }

    public String getNormalField() {
        return normalField;
    }

    public int foo(){return 1;}

}

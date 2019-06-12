package structure;

public class ClassLayout {
    static {
        classVar = "value";
        CONSTANT = "constant value";
    }
    //-------------------------------------------------------------- data structure
    //----------------------------- static fields
    private static String classVar;
    public static final String CONSTANT;
    //----------------------------- instance fields
    private String field1;
    private String field2;
    //--------------------------------------------------------------- methods
    //---------------------------- constructors
    public ClassLayout(){
        // make an object
    }
    //---------------------------- static
    public static void doStatic(ClassLayout s) {  }
    //---------------------------- gets and sets

    //---------------------------- instance
    public void doInstance(){  }
    //---------------------------------------------------------------- test
    public static void main(String[] args) {
        ClassLayout s = new ClassLayout();
        ClassLayout.doStatic(s);
        s.doInstance();
    }
}

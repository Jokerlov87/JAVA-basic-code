package innerclassdemo2;

public class Outer {
    String name;

    private class Inner{
        int a=10;


    }
    public Inner getInstance(){
        return new Inner();
    }
}

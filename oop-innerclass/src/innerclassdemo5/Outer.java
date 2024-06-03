package innerclassdemo5;

public class Outer {


    public void show(){
        int a=10;

        class Inner{
            String name;
            int age;
            public void method1(){
                System.out.println("局部内部类的method1方法");
            }

            public void method2(){
                System.out.println("局部内部类的method2方法");
            }
        }

        Inner i=new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.method1();


    }
}

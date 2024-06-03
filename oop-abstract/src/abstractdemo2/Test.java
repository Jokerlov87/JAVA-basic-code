package abstractdemo2;

public class Test {
    public static void main(String[] args) {
        Dog d=new Dog("小黑",1);

        System.out.println(d.getName()+","+d.getAge());
        d.eat();
        d.drink();
    }
}

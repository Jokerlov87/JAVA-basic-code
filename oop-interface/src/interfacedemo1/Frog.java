package interfacedemo1;

public class Frog extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("吃虫子");

    }

    @Override
    public void swim() {
        System.out.println("在蛙泳");
    }

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }
}

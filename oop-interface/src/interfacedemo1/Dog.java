package interfacedemo1;

public class Dog extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("在狗刨");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}

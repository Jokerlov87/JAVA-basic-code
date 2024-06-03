package innerclassdemo6;

public class Test {
    public static void main(String[] args){
        new Swim(){

            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };

        new Animal(){

            @Override
            public void eat() {
                System.out.println("重写eat方法");
            }
        };


        method(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }
        );
    }

    public static void method(Animal a){
        a.eat();
    }
}
